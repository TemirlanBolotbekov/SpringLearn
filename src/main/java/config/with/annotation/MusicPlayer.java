package config.with.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Scope("prototype")
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("70")
    private int value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genre genre) {
        if(genre == Genre.CLASSICAL) {
            System.out.println(music2.getSong());
        }if(genre == Genre.ROCK){
            System.out.println(music1.getSong());
        }
    }


}

