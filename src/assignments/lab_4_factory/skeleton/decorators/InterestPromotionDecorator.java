package assignments.lab_4_factory.skeleton.decorators;


import assignments.lab_4_factory.skeleton.InterestStrategy;

public class InterestPromotionDecorator implements InterestStrategy {
    InterestStrategy interestStrategy;

    @Override
    public double addInterest(Double balance) {
        return interestStrategy.addInterest(balance);
    }
}
