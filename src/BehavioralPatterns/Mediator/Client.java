package BehavioralPatterns.Mediator;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public abstract class Client {
    protected Mediator mediator;
    protected String name;

    public Client(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public abstract void send (String msg);
    public abstract void receive (String msg);
}
