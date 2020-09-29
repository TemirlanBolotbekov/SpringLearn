package interfacE;

public class Telegram implements Messenger {

    @Override
    public void send() {
        System.out.println("Good morning!");
    }

    @Override
    public void get() {
        System.out.println("Hello Tima");
    }
}
