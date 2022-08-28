package Tamagotchi;

import java.util.ArrayList;
import java.util.List;

public class Homos {
    String homosName;
    List<Pet> listPet = new ArrayList<>();

    public Homos(String name) {
        homosName = name;
    }

    void getPet(String name) {
        listPet.add(new Pet(name));
        System.out.println("Человек " + homosName + " завёл питомца " + name);
    }

    void printAllPet() {
        String buf = "";
        for (Pet p : listPet) {
            buf += p.namePet + " ";
        }
        System.out.println("Питомцы " + homosName + ": " + buf);
    }
}
