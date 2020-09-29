package interfacE;

public class Viber implements Messenger {

    @Override
    public void send() {
        System.out.println("Hello World!");
    }

    @Override
    public void get() {
        System.out.println("Hi Kyrgyzstan!");
    }
}
