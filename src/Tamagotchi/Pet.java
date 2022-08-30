package Tamagotchi;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    private String id;
    private String namePet;
    List<Integer> listEat = new ArrayList<>();
    List<Integer> reputationHomos = new ArrayList<>();

    public Pet(String name, String id) {
       this.namePet = name;
       this.id = id;
    }

    public void renamePet(String name){
        this.namePet = name;
    }

    public String getIdPet(){
        return this.id;
    }

    public String getNamePet(){
        return namePet;
    }
}
