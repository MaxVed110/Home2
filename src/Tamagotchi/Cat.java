package Tamagotchi;

public class Cat extends Pet {

    public Cat(String name, String id) {
        super(name, id);
    }

    public Cat(String name){
        this(name, "кот");
    }
}
