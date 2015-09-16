package BehavioralPatterns.ObserverPattern;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public interface Subject {
    public void  notifyAllObservers();
    public void  addObservers(Observer observer);
    public void  removeObservers(Observer observer);

}
