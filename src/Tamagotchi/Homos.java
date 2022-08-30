package Tamagotchi;

import java.util.ArrayList;
import java.util.List;

public class Homos implements Activity {
    String homosName;
    List<Pet> listPet = new ArrayList<>();

    public Homos(String name) {
        homosName = name;
    }

    void setPet(String name, String flag) {
        switch (flag) {
            case "C" -> {
                listPet.add(new Cat(name));
                System.out.println("Человек " + homosName + " завёл кота " + name);
            }
            case "D" -> {
                listPet.add(new Dog(name));
                System.out.println("Человек " + homosName + " завёл собаку " + name);
            }
            case "H" -> {
                listPet.add(new Hamster(name));
                System.out.println("Человек " + homosName + " завёл хомяка " + name);
            }
            default -> System.out.println("Таких животных ещё не придумали");
        }
    }

    void setPet(){
        setPet(new RandName().name(), "C");
    }
}
