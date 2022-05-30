package assignments.lab_4_factory.skeleton.decorators;

public class PTwo extends InterestPromotionDecorator {

    @Override
    public double addInterest(Double balance) {
        return (0.02*balance);
    }
}
