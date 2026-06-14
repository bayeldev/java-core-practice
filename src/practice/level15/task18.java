package practice.level15;

public class task18 {
    public static void main(String[] args) {
        ShellterPet first = new ShellterPet();
        ShellterPet second = new ShellterPet();
    }
}

class ShellterPet {
    static {
        System.out.println("Начинаем регистрацию нового питомца...");
    }

    ShellterPet() {
        System.out.println("Запись о питомце успешно создана!");
    }
}
