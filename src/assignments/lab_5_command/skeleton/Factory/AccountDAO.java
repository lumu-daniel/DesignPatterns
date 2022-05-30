package assignments.lab_5_command.skeleton.Factory;

import assignments.lab_5_command.skeleton.Account;

import java.util.Collection;

public interface AccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(String accountnumber);
	Collection<Account> getAccounts();
}
