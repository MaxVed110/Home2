package Tamagotchi;

public class Main {
    public static void main(String[] args) {
        Homos person = new Homos("Иван");
        person.setPet("Кот");
        person.setPet("Собака");
        person.printAllPet();
        Activity act = new Activity();
        act.feed(person, "Кот");
        act.stroke(person, "Кот");
        act.summon(person, "Кот");
        act.summon(person, "Собака");
        act.feed(person, "Кот");
        act.summon(person, "Кот");
    }
}
