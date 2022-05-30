package assignments.lab_4.skeleton.Factory;

import assignments.lab_4.skeleton.Account;

import java.util.ArrayList;
import java.util.Collection;

public class MockDaoImpl extends AccountDaoFactory{

    public MockDaoImpl() {
        accountlist = new ArrayList<>();// For mock load normal list
    }

    public void saveAccount(Account account) {
        accountlist.add(account); // add the new account to Mock
    }

    /*Updates accounts from Dummy list*/
    public void updateAccount(Account account) {
        Account accountexist = loadAccount(account.getAccountNumber());
        if (accountexist != null) {
            accountlist.remove(accountexist); // remove the old
            accountlist.add(account); // add the new
        }

    }

    /*Returns accounts from Dummy*/
    public Account loadAccount(String accountNumber) {
        for (Account account : accountlist) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    /*Loads from Dummy*/
    public Collection<Account> getAccounts() {
        return accountlist;
    }

}
