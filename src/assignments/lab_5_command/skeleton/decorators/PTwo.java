package assignments.lab_5_command.skeleton.decorators;

public class PTwo extends InterestPromotionDecorator {

    @Override
    public double addInterest(Double balance) {
        return (0.02*balance);
    }
}
