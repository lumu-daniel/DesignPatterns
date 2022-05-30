package assignments.lab_5_command.skeleton.decorators;

public class POne extends InterestPromotionDecorator {

    @Override
    public double addInterest(Double balance) {
        return (0.01*balance);
    }
}
