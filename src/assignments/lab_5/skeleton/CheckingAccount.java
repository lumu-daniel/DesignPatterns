package assignments.lab_5.skeleton;

import assignments.lab_5.skeleton.decorators.InterestPromotionDecorator;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, InterestPromotionDecorator interestPromotionDecorator) {
        super(accountNumber);
        interestStrategy = new CheckingInterestImpStrategy(interestPromotionDecorator);
    }
}
