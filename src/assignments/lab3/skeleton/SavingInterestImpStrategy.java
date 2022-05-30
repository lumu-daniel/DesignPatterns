package assignments.lab3.skeleton;

import assignments.lab3.skeleton.decorators.InterestPromotionDecorator;

public class SavingInterestImpStrategy extends InterestPromotionDecorator {

    InterestPromotionDecorator interestPromo;
    public SavingInterestImpStrategy(InterestPromotionDecorator interestPromotionDecorator) {
        this.interestPromo = interestPromotionDecorator;
    }

    /*If balance < 1000 then you get 1% interest
          If balance > 1000 and balance < 5000 then you get 2% interest
          If balance > 5000 then you get 4% interest */
    @Override
    public double addInterest(Double balance) {
        if(balance<1000)
            return interestPromo.addInterest(balance)+(0.01*balance);
        else if(balance>1000 && balance<5000)
            return interestPromo.addInterest(balance)+(0.02*balance);
        else
            return interestPromo.addInterest(balance)+(0.04*balance);
    }
}
