package lesson6_2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor(Color.RED);
        cat.setAge(2);
        System.out.println(cat.info());

        Dog dog = new Dog(5, Color.GREEN, "Sit, run");
        System.out.println(dog.info());

        FightingDog fightingDog = new FightingDog(1, Color.BLUE,
                "Fight", 9);
        System.out.println(fightingDog.info());

        String str = "Hello";
        if (fightingDog.getCommands() == "Figth") {
            System.out.println("This dog is dangerous");
        }

        if (fightingDog.getColor() == Color.BLUE) {
            System.out.println("This dog is beautiful");
        }
    }
}
