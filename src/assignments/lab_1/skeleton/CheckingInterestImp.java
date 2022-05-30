package assignments.lab_1.skeleton;

public class CheckingInterestImp implements Interest{

    /*
    *
    If balance < 1000 then you get 1,5% interest
    If balance > 1000 then you get 2,5% interest
    * */
    @Override
    public double addInterest(Double balance) {
        if(balance<1000)
            return (balance*0.015);
        else
            return (balance*0.025);
    }
}
