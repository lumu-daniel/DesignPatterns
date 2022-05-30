package assignments.lab_2.skeleton;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        interest = new CheckingInterestImp();
    }
}
