package FamilyTree;

public class Main {
    public static void main(String[] args) {
        Person ig = new Person("Игорь", 23, 1);
        Person ig2 = new Person("Саша", 23, 1);
        Person ig3 = new Person("Маша", 23, 1);
        Person ig4 = new Person("Таня", 23, 1);
        Person ig5 = new Person("Ирина", 33, 1);

        FamilyTree treeIv = new FamilyTree("Ивановы");
        treeIv.addNode(ig);
        treeIv.addNode(ig2);
        treeIv.appendNode(1, ig3);
        treeIv.addNode(ig4);
        treeIv.printFamilyTree();
        treeIv.addSpouse(2, ig2, ig5);
        treeIv.printFamilyTree();
        treeIv.addRelationship(ig3, ig4);
        treeIv.addRelationship(ig3, ig5);
        treeIv.printResearch(ig3, "C");
        treeIv.printResearch(ig5, "P");
    }
}
