package BehavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class USBMediator implements Mediator {

    private List<Client> clientList;

    public USBMediator() {
        this.clientList = new ArrayList<>();
    }

    @Override
    public void createConnection(String msg, Client client) {
        for (Client c : clientList) {
            if(c!=client){
                c.receive(msg);
            }
        }
    }

    @Override
    public void addClient(Client client) {
        clientList.add(client);
    }
}
