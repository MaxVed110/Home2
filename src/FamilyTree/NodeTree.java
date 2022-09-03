package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class NodeTree {
    List<Person> listNode = new ArrayList<>();

    public NodeTree(Person name) {
        listNode.add(name);
    }

    void appendNode(Person name) {
        listNode.add(name);
    }
}
