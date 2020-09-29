package config.with.javacode;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("config.with.javacode")
@PropertySource("classpath:application.properties")

public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic(){

        return  new PopMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(),rockMusic(),popMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){

        return new MusicPlayer(musicList());
    }

}
