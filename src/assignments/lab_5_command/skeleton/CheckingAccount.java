package assignments.lab_5_command.skeleton;

import assignments.lab_5_command.skeleton.decorators.InterestPromotionDecorator;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, InterestPromotionDecorator interestPromotionDecorator) {
        super(accountNumber);
        interestStrategy = new CheckingInterestImpStrategy(interestPromotionDecorator);
    }
}
