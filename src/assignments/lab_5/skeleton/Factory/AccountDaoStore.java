package assignments.lab_5.skeleton.Factory;

public class AccountDaoStore {

    public static AccountDAO getAccountDao(FactoryType factoryType){
       return switch (factoryType){
            case MOCK -> new MockDaoImpl();
            case REAL -> new AccountDAOImpl();
        };
    }
}
