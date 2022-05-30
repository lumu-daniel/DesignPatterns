package assignments.lab_4_factory.skeleton;

import assignments.lab_4_factory.skeleton.decorators.InterestPromotionDecorator;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, InterestPromotionDecorator interestPromotionDecorator) {
        super(accountNumber);
        interestStrategy = new CheckingInterestImpStrategy(interestPromotionDecorator);
    }
}
