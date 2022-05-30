package assignments.lab_5.skeleton.Factory;

import assignments.lab_5.skeleton.Account;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDAOImpl extends AccountDaoFactory {

	public AccountDAOImpl() {
		accountlist = new ArrayList<>();// Should come from DB probably
	}

	public void saveAccount(Account account) {
		accountlist.add(account); // add the new account to Database.
	}

	/*Updates Database*/
	public void updateAccount(Account account) {
		Account accountexist = loadAccount(account.getAccountNumber());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new
		}

	}

	/*Loads from Database*/
	public Account loadAccount(String accountNumber) {
		for (Account account : accountlist) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}

	/*Loads accounts from DB*/
	public Collection<Account> getAccounts() {
		return accountlist;
	}

}
