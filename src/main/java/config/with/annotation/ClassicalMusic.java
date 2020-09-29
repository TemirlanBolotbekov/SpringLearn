package config.with.annotation;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> classicalMusic = new ArrayList<>();

    @Override
    public List<String> getSong() {
        classicalMusic.add("Bethoven-Moon sonat");
        classicalMusic.add("Mocart-Spring note");
        classicalMusic.add("Shopen-Love dramms");


        return classicalMusic ;
    }
}
