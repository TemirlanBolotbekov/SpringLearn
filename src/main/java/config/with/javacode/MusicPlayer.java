package config.with.javacode;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> allSongs){
        this.musicList = allSongs;
    }


    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong();

    }
}


