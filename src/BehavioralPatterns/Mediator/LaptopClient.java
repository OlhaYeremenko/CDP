package BehavioralPatterns.Mediator;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class LaptopClient extends Client {


    public LaptopClient(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+": Sending data : "+msg);

    }

    @Override
    public void receive(String msg) {

        System.out.println(this.name+": Receive data : "+msg);
    }
}
