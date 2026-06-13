package practice.level14;

public class task17 {
    public static void main(String[] args) {
        Animal wildAnimal = new Animal();
        System.out.println(wildAnimal.animalAge);
        System.out.println(wildAnimal.animalName);
    }
}

class Animal {
    int animalAge;
    String animalName;
}
