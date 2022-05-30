package assignments.lab_4.skeleton;

import assignments.lab_4.skeleton.Factory.AccountDAO;
import assignments.lab_4.skeleton.Factory.FactoryType;
import assignments.lab_4.skeleton.decorators.PThree;

import java.util.Collection;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
	
	public AccountServiceImpl(){
		accountDAO = FactoryType.MOCK.getAccountDaoFactory();
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		
		accountDAO.updateAccount(account);
	}

	@Override
	public Account createAccount(String accountNumber, String customerName, AccountType accountType) {
		Account account = (accountType.equals(AccountType.SAVINGS))?new SavingsAccount(accountNumber, new PThree()):new CheckingAccount(accountNumber, new PThree());
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);

		return account;
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public double addInterest(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account.getInterest();
	}
}
