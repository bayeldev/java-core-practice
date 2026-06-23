package practice.level16;

public class task09 {
    public static void main(String[] args) {
        MagicalCreature mg = new MagicalCreature() {
            @Override
            public void makeSound() {
                System.out.println("Ква-ква!");
            }
        };
        mg.makeSound();
    }
}


class MagicalCreature {
    void makeSound () {
        System.out.println("Существо издаёт звук");
    }
}
