package Tamagotchi;

public class Main {
    public static void main(String[] args) {
        Homos igor = new Homos("Игорь");

        igor.setPet();
        igor.setPet("Сара", "D");

        igor.printAllPet(igor);
        igor.feed(igor, "Сара");
        igor.feed(igor, "Сара");
        igor.summon(igor, "Сара");



    }
}
