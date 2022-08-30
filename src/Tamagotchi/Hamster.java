package Tamagotchi;

public class Hamster extends Pet{

    public Hamster(String name, String id) {
        super(name, id);
    }

    public Hamster(String name){
        this(name, "хомяк");
    }
}
