package config.with.javacode;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {

        return "Bethoven - 'Moon sonat'" ;
    }
}
