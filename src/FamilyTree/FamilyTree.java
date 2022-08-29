package FamilyTree;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FamilyTree {
    Map<Integer, NodeTree> tree = new TreeMap<>();
    private int levelTree = 1;
    String nameFamily;

    public FamilyTree(String name) {
        this.nameFamily = name;
    }

    void addNode(Person name) {
        this.tree.put(levelTree, new NodeTree(name));
        levelTree += 1;
    }

    void addNodeChildren(Person nameParent, Person nameChildren) {
        this.tree.put(levelTree, new NodeTree(nameChildren));
        levelTree += 1;
        nameParent.children += nameChildren.namePerson;
        nameChildren.parent += nameParent.namePerson;
    }

    void appendNode(int level, Person name) {
        this.tree.get(level).appendNode(name);
    }

    void addRelationship(Person nameParent, Person nameChildren) {
        nameParent.children += nameChildren.namePerson + " ";
        nameChildren.parent += nameParent.namePerson + " ";
    }

    void addSpouse(int level, Person nameMan, Person nameVoman) {
        for (List<Person> p : this.tree.get(level).listNode) {
            if (p.get(0).namePerson.equals(nameMan.namePerson)) {
                p.add(nameVoman);
            }
            if (p.get(0).namePerson.equals(nameVoman.namePerson)) {
                p.add(nameMan);
            }
        }
    }

    void printFamilyTree() {
        for (int key : this.tree.keySet()) {
            System.out.println("Поколение " + key);
            for (List<Person> p : this.tree.get(key).listNode) {
                if (p.size() == 2) {
                    System.out.println(p.get(0).namePerson + ", возраст - " + p.get(0).agePerson
                            + ", cупруг(а) " + p.get(1).namePerson + ", возраст - " + p.get(1).agePerson);
                } else {
                    System.out.println(p.get(0).namePerson + ", возраст - " + p.get(0).agePerson);
                }
            }
            System.out.println();
        }
    }

    void printResearch(Person name, String flag) {
        switch (flag){
            case "C":
                System.out.println("Дети " + name.namePerson + ": " + name.children);
                break;
            case "P":
                System.out.println("Родители " + name.namePerson + ": " + name.parent);
                break;
            case "PC":
                System.out.println("Дети " + name.namePerson + ": " + name.children);
                System.out.println("Родители " + name.namePerson + ": " + name.parent);
                break;
            default:
                System.out.println("Команда некорректна, попробуйте: C, P, или PC");
        }
    }
}
