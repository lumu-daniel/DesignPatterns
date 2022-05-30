package assignments.lab_4.skeleton.decorators;


import assignments.lab_4.skeleton.InterestStrategy;

public class InterestPromotionDecorator implements InterestStrategy {
    InterestStrategy interestStrategy;

    @Override
    public double addInterest(Double balance) {
        return interestStrategy.addInterest(balance);
    }
}
