package spring.learn.with.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


//        Работа с инит и дестрой методами;

        ClassicalMusic clsMusic = context.getBean("classMusicBean",ClassicalMusic.class);
        System.out.println(clsMusic.getSong());


//        Music music = context.getBean("classMusicBean", Music.class);
//        Music music = context.getBean("popMusicBean",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//          MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//          MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//          boolean compare = musicPlayer == musicPlayer2;
//
//        System.out.println(compare);
//
//        musicPlayer2.setValue(10);
//
////        musicPlayer.playMusicList();
//
//        System.out.println(musicPlayer.getValue());
//        System.out.println(musicPlayer2.getValue());

        context.close();
    }
}
