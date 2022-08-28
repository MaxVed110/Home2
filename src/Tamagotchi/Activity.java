package Tamagotchi;

public class Activity {

    public Activity() {

    }

    void feed(Homos name, String namePet) {
        boolean flag = false;
        for (Pet p : name.listPet) {
            if (p.namePet.equals(namePet)) {
                p.listEat.add(1);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Вы покормили питомца");
        } else {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    void summon(Homos name, String namePet) {
        boolean flag = true;
        for (Pet p : name.listPet) {
            if (p.namePet.equals(namePet)) {
                if (p.listEat.size() > 1) {
                    System.out.println("Событие: человек " + name.homosName + " позвал питомца "
                            + p.namePet + " и он подошёл к нему");
                } else {
                    System.out.println("Событие: глупый " + name.homosName + " забыл покормить "
                            + p.namePet + " и в ответ получил лишь презренный взгляд");
                }
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Такого животного у этого человека нет");
        }
    }

    void stroke(Homos name, String namePet) {
        boolean flag = true;
        for (Pet p : name.listPet) {
            if (p.namePet.equals(namePet)) {
                p.reputationHomos.add(1);
                System.out.println("Событие: +1 очко репутации " + name.homosName + " у " + p.namePet);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Такого животного у этого человека нет");
        }
    }
}
