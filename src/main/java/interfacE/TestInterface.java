package interfacE;

public class TestInterface {
    public static void main(String [] args) {

        Telegram telegram = new Telegram();
        Viber viber = new Viber();
        WhatsUp whatsUp = new WhatsUp();

        outputMess(telegram);
        outputMess(viber);
        outputMess(whatsUp);
    }
    public static void outputMess(Messenger messenger) {
        messenger.get();
        messenger.send();
    }
}


