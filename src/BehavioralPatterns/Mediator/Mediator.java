package BehavioralPatterns.Mediator;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public interface Mediator {

    public void createConnection(String msg, Client client);

    void addClient(Client client);

}
