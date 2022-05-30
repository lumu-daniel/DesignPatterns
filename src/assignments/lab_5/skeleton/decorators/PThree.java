package assignments.lab_5.skeleton.decorators;


public class PThree extends InterestPromotionDecorator {

    @Override
    public double addInterest(Double balance) {
        return (0.03*balance);
    }
}
