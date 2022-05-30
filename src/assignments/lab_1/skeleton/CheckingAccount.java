package assignments.lab_1.skeleton;

public class CheckingAccount extends Account{

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        interest = new CheckingInterestImp();
    }
}
