package assignments.lab3.skeleton;

import assignments.lab3.skeleton.decorators.InterestPromotionDecorator;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, InterestPromotionDecorator interestPromotionDecorator) {
        super(accountNumber);
        interestStrategy = new SavingInterestImpStrategy(interestPromotionDecorator);
    }


}
