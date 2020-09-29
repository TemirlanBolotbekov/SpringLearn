package spring.learn.with.xml;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

//    private Music music;
    private String name;
    private int value;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }


    // IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer(){}

//     D.I
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    private List<Music> musicList = new ArrayList<>();


//    public MusicPlayer(List<Music> musicList) { this.musicList = musicList; }

    public List<Music> getMusicList() { return musicList; }

    public void setMusicList(List<Music> musicList) { this.musicList = musicList; }

//    public void playMusic() {
////        System.out.println("Playing: " + music.getSong(musicList) );
//        System.out.println(musicList );
//    }


    public void playMusicList() {

        for(Music music : musicList)
            System.out.println(music.getSong());

    }
}
