package FamilyTree;

public class Main {
    public static void main(String[] args) {

        FamilyTree tree = new FamilyTree("Ивановы");

        tree.addPersonNewNode("Прародитель", 121, 1);
        tree.addPersonNewNode("Бабушка", 67, 2);
        tree.addChildren("Маша", 45, 3, 2);
        tree.addChildren("Миша", 35, 4, 2);
        tree.addPersonNewNode("Саша", 23, 5);
        tree.addSpouseName("Даща", 20, 5);
        tree.addParent("Миша", 35, 4, 5);

        tree.printFamilyTree(tree);
        tree.research(tree, 2, "C");
    }
}
