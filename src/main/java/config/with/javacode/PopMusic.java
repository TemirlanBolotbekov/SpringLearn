package config.with.javacode;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class PopMusic implements Music {

    @Override
    public String getSong() {

        return "Полина Гагарина - 'Туса на море'";
    }
}
