package assignments.lab_4_factory.skeleton;

import assignments.lab_4_factory.skeleton.decorators.InterestPromotionDecorator;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, InterestPromotionDecorator interestPromotionDecorator) {
        super(accountNumber);
        interestStrategy = new SavingInterestImpStrategy(interestPromotionDecorator);
    }


}
