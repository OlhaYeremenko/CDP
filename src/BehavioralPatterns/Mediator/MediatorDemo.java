package BehavioralPatterns.Mediator;

/**
 * Created by Olha_Yeremenko on 16.09.2015.
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator= new USBMediator();
        Client asus= new LaptopClient(mediator,"ASUS");
        Client nokiaSmaprtPhone= new LaptopClient(mediator,"NOKIA");

        mediator.addClient(asus);
        mediator.addClient(nokiaSmaprtPhone);
        asus.send("musicFolder");
        nokiaSmaprtPhone.receive("musicFolder");
    }

}
