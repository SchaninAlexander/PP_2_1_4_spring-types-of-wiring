package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {


    private Egg6 egg;

    public Duck5(@Qualifier("egg6") Egg6 egg) {
        this.egg = egg;
    }


    @Autowired
    public Egg6 setEgg(@Qualifier("egg6") Egg6 egg){return egg;}

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
