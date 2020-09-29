package config.with.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Music music = context.getBean("popMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music);
//        musicPlayer1.playMusic();
//
//        Music music2 = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();


        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        musicPlayer.playMusic(Genre.ROCK);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getValue());
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer2.getValue());

        System.out.println(musicPlayer == musicPlayer2);

//       RockMusic rockMusic = new RockMusic();
//        System.out.println(rockMusic.getSong());


        context.close();
    }
}
