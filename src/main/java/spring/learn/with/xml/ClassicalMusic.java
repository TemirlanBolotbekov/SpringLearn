package spring.learn.with.xml;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void myInit(){
        System.out.println("Initialization...");
    }

    public void myDestroy(){
        System.out.println("Destroying...");
    }

    @Override
    public String getSong() {

        return  "Frederic Shopen - Do Re Mi Fa So Lya";
    }
}
