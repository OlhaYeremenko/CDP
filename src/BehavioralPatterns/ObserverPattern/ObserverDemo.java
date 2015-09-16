package BehavioralPatterns.ObserverPattern;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Client firstClient = new Client("Olha Yeremenko");
        Client secondClient = new Client("Viktoriia Akhadova");

        NewsSystem mtsNews= new NewsSystem("Cool news!","Body of news","Available");
        mtsNews.addObservers(firstClient);
        mtsNews.addObservers(secondClient);

        //notifyAll
        mtsNews.setNewsAvailability("Available!");
    }
}
