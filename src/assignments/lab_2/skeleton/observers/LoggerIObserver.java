package assignments.lab_2.skeleton.observers;

public class LoggerIObserver implements IObserver {

    @Override
    public void performAction(Double balance) {
        System.out.println("Logging balance: "+balance);
    }
}
