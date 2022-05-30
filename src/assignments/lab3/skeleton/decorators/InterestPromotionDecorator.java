package assignments.lab3.skeleton.decorators;


import assignments.lab3.skeleton.InterestStrategy;

public class InterestPromotionDecorator implements InterestStrategy {
    InterestStrategy interestStrategy;

    @Override
    public double addInterest(Double balance) {
        return interestStrategy.addInterest(balance);
    }
}
