package config.with.annotation;


import org.springframework.stereotype.Component;

import java.util.List;

@Component("popMusic")
public class PopMusic implements Music {

    @Override
    public List<String> getSong() {
        return null;
    }
}
