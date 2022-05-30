package assignments.lab_2.skeleton.observers;

public class EmailSenderIObserver implements IObserver {

    @Override
    public void performAction(Double balance) {
        System.out.println("Emailing balance: "+balance);
    }
}
