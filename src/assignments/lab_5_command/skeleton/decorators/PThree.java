package assignments.lab_5_command.skeleton.decorators;


public class PThree extends InterestPromotionDecorator {

    @Override
    public double addInterest(Double balance) {
        return (0.03*balance);
    }
}
