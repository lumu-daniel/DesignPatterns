package assignments.lab_4.skeleton.Factory;

public enum FactoryType {
    REAL(new AccountDAOImpl()),
    MOCK(new MockDaoImpl());

    private AccountDaoFactory accountDaoFactory;
    FactoryType(AccountDaoFactory accountDAO) {
        this.accountDaoFactory = accountDAO;
    }

    public AccountDaoFactory getAccountDaoFactory(){
        return accountDaoFactory;
    }
}
