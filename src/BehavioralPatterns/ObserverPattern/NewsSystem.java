package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class NewsSystem implements Subject {

    private List<Observer> observers = new ArrayList();
    private String newsTitle;
    private String newsBody;

    String newsAvailability;

    public NewsSystem(String newsTitle, String newsBody, String newsAvailability) {
        this.newsTitle = newsTitle;
        this.newsBody = newsBody;
    }

    public String getNewsAvailability() {
        return newsAvailability;
    }

    public void setNewsAvailability(String newsAvailability) {
        this.newsAvailability = newsAvailability;
        notifyAllObservers();
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void notifyAllObservers() {
        System.out.println("Notify that new news created");
        for (Observer observer : observers) {
            observer.update(this.newsAvailability);
        }
    }

    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

}
