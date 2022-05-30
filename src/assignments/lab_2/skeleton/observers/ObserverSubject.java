package assignments.lab_2.skeleton.observers;

public interface ObserverSubject {
    void addObserver(IObserver O);
    void deleteObserver(IObserver O);
    void notifyObserver(Double balance);
}
