package interfacE;

public class WhatsUp implements Messenger {
    @Override
    public void send() {
        System.out.println("Hi Mam!");
    }

    @Override
    public void get() {
        System.out.println("Hi son!");
    }
}
