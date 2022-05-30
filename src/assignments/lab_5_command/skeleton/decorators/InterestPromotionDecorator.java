package assignments.lab_5_command.skeleton.decorators;


import assignments.lab_5_command.skeleton.InterestStrategy;

public class InterestPromotionDecorator implements InterestStrategy {
    InterestStrategy interestStrategy;

    @Override
    public double addInterest(Double balance) {
        return interestStrategy.addInterest(balance);
    }
}
