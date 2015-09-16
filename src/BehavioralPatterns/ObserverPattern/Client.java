package BehavioralPatterns.ObserverPattern;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class Client implements Observer {

    private String clientName;

    public Client(String clientName) {
        this.clientName = clientName;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(String news) {
         System.out.println(
                 String.format("Hello %s, new one news %s for you",clientName, news));
    }
}
