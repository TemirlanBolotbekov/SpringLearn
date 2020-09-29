package config.with.annotation;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class  RockMusic implements Music {

    List<String> rockMusic = new ArrayList<>();
    @Override
    public List<String> getSong() {
        rockMusic.add("Wind cries Mary");
        rockMusic.add("Rammstein-Dasist");
        rockMusic.add("Pharaon-5 minut");


        return rockMusic;
    }
}
