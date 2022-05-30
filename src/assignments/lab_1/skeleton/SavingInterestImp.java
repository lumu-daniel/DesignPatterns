package assignments.lab_1.skeleton;

public class SavingInterestImp implements Interest{

    /*If balance < 1000 then you get 1% interest
      If balance > 1000 and balance < 5000 then you get 2% interest
      If balance > 5000 then you get 4% interest */
    @Override
    public double addInterest(Double balance) {
        if(balance<1000)
            return (0.01*balance);
        else if(balance>1000 && balance<5000)
            return (0.02*balance);
        else
            return (0.04*balance);
    }
}
