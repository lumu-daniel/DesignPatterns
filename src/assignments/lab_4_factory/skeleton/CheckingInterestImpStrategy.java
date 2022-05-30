package assignments.lab_4_factory.skeleton;

import assignments.lab_4_factory.skeleton.decorators.InterestPromotionDecorator;

public class CheckingInterestImpStrategy extends InterestPromotionDecorator {
    InterestPromotionDecorator interestPromo;
    public CheckingInterestImpStrategy(InterestPromotionDecorator interestPromotionDecorator) {
        this.interestPromo = interestPromotionDecorator;
    }

    /*
        *
        If balance < 1000 then you get 1,5% interest
        If balance > 1000 then you get 2,5% interest
        * */
    @Override
    public double addInterest(Double balance) {
        if(balance<1000)
            return interestPromo.addInterest(balance)+(balance*0.015);
        else
            return interestPromo.addInterest(balance)+(balance*0.025);
    }
}
