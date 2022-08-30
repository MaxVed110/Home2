package Tamagotchi;

import java.util.HashMap;
import java.util.Map;

public class RandName {
    Map<Integer, String> baseName = new HashMap<>();

    public RandName(){
        this.baseName.put(0, "Краказябра");
        this.baseName.put(1, "Меркурий");
        this.baseName.put(2, "Люся");
        this.baseName.put(3, "Барсик");
        this.baseName.put(4, "Монгол");
        this.baseName.put(5, "Иваныч");
    }

    public String name(){
        return this.baseName.get((int)(Math.random()*6));
    }
}
