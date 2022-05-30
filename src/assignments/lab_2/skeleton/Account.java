package assignments.lab_2.skeleton;

import assignments.lab_2.skeleton.observers.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account implements ObserverSubject {
	private Customer customer;

	private String accountNumber;

	protected Interest interest;

	private List<IObserver> observers;

	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		observers = new ArrayList<>();
		addObserver(new LoggerIObserver());
		addObserver(new EmailSenderIObserver());
		addObserver(new SmsSenderIObserver());
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
		AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
		entryList.add(entry);
		notifyObserver(amount);
	}

	public void withdraw(double amount) {
		AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
		entryList.add(entry);
		notifyObserver(amount);
	}

	private void addEntry(AccountEntry entry) {
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		
		entryList.add(fromEntry);
		
		toAccount.addEntry(toEntry);
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
		return interest.addInterest(this.getBalance());
	}

	@Override
	public void addObserver(IObserver O) {
		observers.add(O);
	}

	@Override
	public void deleteObserver(IObserver O) {
		observers.remove(O);
	}

	@Override
	public void notifyObserver(Double balance) {
		observers.forEach(iObserver -> {iObserver.performAction(balance);});
	}
}
