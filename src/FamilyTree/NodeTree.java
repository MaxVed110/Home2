package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class NodeTree {
    List<List<Person>> listNode = new ArrayList<>();
    private int count = 0;

    public NodeTree(Person name) {
        listNode.add(new ArrayList<>());
        listNode.get(count).add(name);
        count += 1;
    }

    void appendNode(Person name) {
        listNode.add(new ArrayList<>());
        listNode.get(count).add(name);
        count += 1;
    }
}
