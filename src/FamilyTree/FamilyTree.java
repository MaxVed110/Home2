package FamilyTree;

import java.util.Map;
import java.util.TreeMap;

public class FamilyTree implements Research {
    Map<Integer, NodeTree> tree = new TreeMap<>();
    private int levelTree = 1;
    String nameFamily;

    public FamilyTree(String name) {
        this.nameFamily = name;
    }

    void addPersonNewNode(String name, int age, int id) {
        this.tree.put(levelTree, new NodeTree(new Person(name, age, id, levelTree)));
        levelTree++;
    }

    void addChildren(String name, int age, int idChildren, int idParent) {
        Person parent = getPerson(this, idParent);
        if (parent != null) {
            parent.listChildren.add(new Person(name, age, idChildren, parent.generationPerson + 1));
            if (tree.containsKey(parent.generationPerson + 1)) {
                tree.get(parent.generationPerson + 1).appendNode(new Person(name, age, idChildren, parent.generationPerson + 1));
            } else {
                tree.put(parent.generationPerson + 1, new NodeTree(new Person(name, age, idChildren, parent.generationPerson + 1)));
                levelTree++;
            }
        } else {
            System.out.println("ошибка");
        }
    }

    void addParent(String name, int age, int idParent, int idChildren) {
        Person children = getPerson(this, idChildren);
        if (children != null) {
            Person parent = getPerson(this, idParent);
            if (parent != null) {
                parent.listChildren.add(children);
            } else {
                tree.get(children.generationPerson - 1).listNode.add((new Person(name, age, idParent, children.generationPerson - 1)));
                parent = getPerson(this, idParent);
                parent.listChildren.add(children);
            }
        } else {
            System.out.println("ошибка");
        }
    }

    void addSpouseName(String nameSpouse, int ageSpouse, int idPerson) {
        Person spouse = getPerson(this, idPerson);
        spouse.listSpouse.add(new Person(nameSpouse, ageSpouse));
    }
}
