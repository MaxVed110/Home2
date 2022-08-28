package Tamagotchi;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    String namePet;
    List<Integer> listEat = new ArrayList<>();
    List<Integer> reputationHomos = new ArrayList<>();

    public Pet(String name) {
        namePet = name;
    }

    public Pet() {
        this("Краказябра");
    }
}
