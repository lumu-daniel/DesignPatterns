package assignments.lab_2.skeleton;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        interest = new SavingInterestImp();
    }


}
