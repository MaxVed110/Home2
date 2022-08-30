package Tamagotchi;

public interface Activity {

    default void printAllPet(Homos name) {
        String buf = "";
        for (Pet p : name.listPet) {
            buf += p.getIdPet() + " ";
            buf += p.getNamePet() + ", ";
        }
        System.out.println("Питомцы " + name.homosName + ": " + buf);
    }

    default void feed(Homos name, String namePet) {
        Pet p = searchPet(name, namePet);
        if (!p.getNamePet().equals("Error")) {
            p.listEat.add(1);
            System.out.println("Вы покормили питомца");
        } else {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    default void summon(Homos name, String namePet) {
        Pet p = searchPet(name, namePet);
        if (!p.getNamePet().equals("Error")) {
            if (p.listEat.size() > 1) {
                System.out.println("Событие: человек " + name.homosName + " позвал питомца "
                        + p.getNamePet() + " и он подошёл к нему");
            } else {
                System.out.println("Событие: глупый " + name.homosName + " забыл покормить "
                        + p.getNamePet() + " и в ответ получил лишь презренный взгляд");
            }
        } else {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    default void stroke(Homos name, String namePet) {
        Pet p = searchPet(name, namePet);
        if (!p.getNamePet().equals("Error")) {
            p.reputationHomos.add(1);
            System.out.println("Событие: +1 очко репутации " + name.homosName + " у " + p.getNamePet());
        } else {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    private Pet searchPet(Homos name, String namePet) {
        for (Pet p : name.listPet) {
            if (p.getNamePet().equals(namePet)) {
                return p;
            }
        }
        return new Cat("Error");
    }
}
