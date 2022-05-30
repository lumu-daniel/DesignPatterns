package assignments.lab_5_command.skeleton;

import assignments.lab_5_command.skeleton.command.CommandControl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account {
	private Customer customer;

	private String accountNumber;

	protected InterestStrategy interestStrategy;

	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();

	private CommandControl commandControl;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		commandControl = new CommandControl();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		double balance = 0;
		for (AccountEntry entry : entryList) {
			balance += entry.getAmount();
		}
		return balance;
	}

	public void deposit(double amount) {
		commandControl.setDoCommand(0, ()->{
			AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
			entryList.add(entry);
		});
		commandControl.executeDoCommand(0);
	}

	public void withdraw(double amount) {
		commandControl.setDoCommand(1,()->{
			AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
			entryList.add(entry);
		});
		commandControl.executeDoCommand(1);
	}

	private void addEntry(AccountEntry entry) {
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		commandControl.setDoCommand(2,()->{
			AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
					toAccount.getCustomer().getName());
			AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
					toAccount.getCustomer().getName());

			entryList.add(fromEntry);

			toAccount.addEntry(toEntry);
		});
		commandControl.executeDoCommand(2);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}

	public double getInterest(){
		return interestStrategy.addInterest(this.getBalance());
	}

	public void unDoTransaction(){
		commandControl.undoCommand();
	}

	public void reDoTransaction(){
		commandControl.redoCommand();
	}

}
