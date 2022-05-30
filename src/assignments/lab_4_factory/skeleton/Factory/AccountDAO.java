package assignments.lab_4_factory.skeleton.Factory;

import assignments.lab_4_factory.skeleton.Account;

import java.util.Collection;

public interface AccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(String accountNumber);
	Collection<Account> getAccounts();
}
