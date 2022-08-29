package Tamagotchi;

public class Activity {

    public Activity() {

    }

    void feed(Homos name, String namePet) {
        Pet p = searchPet(name, namePet);
        if (!p.namePet.equals("Error")) {
            p.listEat.add(1);
            System.out.println("Вы покормили питомца");
        } else {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    void summon(Homos name, String namePet) {
        Pet p = searchPet(name, namePet);
        if (!p.namePet.equals("Error")) {
            if (p.listEat.size() > 1) {
                System.out.println("Событие: человек " + name.homosName + " позвал питомца "
                        + p.namePet + " и он подошёл к нему");
            } else {
                System.out.println("Событие: глупый " + name.homosName + " забыл покормить "
                        + p.namePet + " и в ответ получил лишь презренный взгляд");
            }
        } else {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    void stroke(Homos name, String namePet) {
        Pet p = searchPet(name, namePet);
        if (!p.namePet.equals("Error")) {
            p.reputationHomos.add(1);
            System.out.println("Событие: +1 очко репутации " + name.homosName + " у " + p.namePet);
        } else {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    Pet searchPet(Homos name, String namePet) {
        for (Pet p : name.listPet) {
            if (p.namePet.equals(namePet)) {
                return p;
            }
        }
        return new Pet("Error");
    }
}
