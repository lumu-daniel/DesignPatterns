package assignments.lab3.skeleton.decorators;

import assignments.lab3.skeleton.InterestStrategy;

public class POne extends InterestPromotionDecorator{

    @Override
    public double addInterest(Double balance) {
        return (0.01*balance);
    }
}
