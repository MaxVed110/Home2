package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String namePerson;
    int agePerson;
    int generationPerson;
    int idPerson;
    List<Person> listChildren = new ArrayList<>();
    List<Person> listSpouse = new ArrayList<>();

    public Person(String name, int age, int id, int generation) {
        this.namePerson = name;
        this.agePerson = age;
        this.idPerson = id;
        this.generationPerson = generation;
    }

    public Person(String name, int age) {
        this(name, age, 0, 0);
    }
}
