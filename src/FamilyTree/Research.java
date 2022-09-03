package FamilyTree;

public interface Research {

    default void research(FamilyTree tree, int id, String flag) {
        switch (flag) {
            case "C" -> printChildren(tree, id);
            case "P" -> printParent(tree, id);
            case "S" -> printSpouse(tree, id);
            default -> System.out.println("Такой команды нет. Доступные: 'C' 'P' 'S'");
        }
    }

    private void printChildren(FamilyTree tree, int idParent) {
        Person parent = getPerson(tree, idParent);
        if (parent == null) {
            System.out.println("Такого человека не существует");
        } else if (parent.listChildren.size() == 0) {
            System.out.println("Детей нет");
        } else {
            for (Person ch : parent.listChildren) {
                System.out.print(ch.namePerson + " - " + ch.idPerson + "  // ");
            }
        }
    }

    private void printParent(FamilyTree tree, int idChildren) {
        Person children = getPerson(tree, idChildren);
        StringBuilder res = new StringBuilder("Родители: ");
        if (children == null) {
            System.out.println("Такого человека не существует");
        } else {
            for (Person parent : tree.tree.get(children.generationPerson - 1).listNode) {
                for (Person childrenInP : parent.listChildren) {
                    if (childrenInP.idPerson == idChildren) {
                        res.append(parent.namePerson).append(" - ").append(parent.idPerson).append("//");
                    }
                }
            }
        }
        if (res.toString().equals("Родители: ")) {
            System.out.println("Родителей нет");
        } else {
            System.out.println(res);
        }
    }

    private void printSpouse(FamilyTree tree, int idSpouse) {
        Person spouse = getPerson(tree, idSpouse);
        if (spouse == null) {
            System.out.println("Такого человека не существует");
        } else if (spouse.listSpouse.size() == 0) {
            System.out.println("Холост");
        } else {
            for (Person sp : spouse.listSpouse) {
                System.out.print("Супруг(а)" + sp.namePerson + " - " + sp.idPerson);
            }
        }
    }

    default void printInfoId(FamilyTree tree, int id) {
        Person person = getPerson(tree, id);
        System.out.println(person.namePerson + " " + person.agePerson + " ");
    }

    /**
     * To Do
     * каждый человек хранит информацию о детях -> необходима рекурсия
     */
    default void printFamilyTree(FamilyTree tree) {
        for (int key : tree.tree.keySet()) {
            System.out.println("Поколение " + key);
            for (Person p : tree.tree.get(key).listNode) {
                System.out.print(p.namePerson + " ");
            }
            System.out.println();
        }
    }

    default Person getPerson(FamilyTree tree, int idPerson) {
        for (int key : tree.tree.keySet()) {
            for (Person p : tree.tree.get(key).listNode) {
                if (p.idPerson == idPerson) {
                    return p;
                }
            }
        }
        return null;
    }
}
