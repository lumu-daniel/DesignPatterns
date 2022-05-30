package assignments.lab_2.skeleton.observers;

public class SmsSenderIObserver implements IObserver {

    @Override
    public void performAction(Double balance) {
        System.out.println("Messaging balance: "+balance+"\n");
    }
}
