package assignments.lab3.skeleton;

import assignments.lab3.skeleton.decorators.InterestPromotionDecorator;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, InterestPromotionDecorator interestPromotionDecorator) {
        super(accountNumber);
        interestStrategy = new CheckingInterestImpStrategy(interestPromotionDecorator);
    }
}
