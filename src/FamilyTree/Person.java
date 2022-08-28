package FamilyTree;

public class Person {
    String namePerson;
    int agePerson;
    int idPerson;
    String children = "";
    String parent = "";

    public Person(String name, int age, int id, String children, String parent) {
        this.namePerson = name;
        this.agePerson = age;
        this.idPerson = id;
        this.children += children;
        this.parent += parent;
    }

    public Person(String name, int age, int id) {
        this(name, age, id, "", "");
    }
}
