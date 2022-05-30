package assignments.lab_5_command.skeleton;

import assignments.lab_5_command.skeleton.decorators.InterestPromotionDecorator;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, InterestPromotionDecorator interestPromotionDecorator) {
        super(accountNumber);
        interestStrategy = new SavingInterestImpStrategy(interestPromotionDecorator);
    }


}
