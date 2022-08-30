package Tamagotchi;

public class Dog extends Pet{

    public Dog(String name, String id) {
        super(name, id);
    }

    public Dog(String name){
        this(name, "собака");
    }
}
