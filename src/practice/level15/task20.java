package practice.level15;

public class task20 {
    public static void main(String[] args) {
        UserProfile first = new UserProfile();
        UserProfile second = new UserProfile("Aidar");
    }
}

class UserProfile {
    private String userIdentifer;
    private String name;
    {
        userIdentifer = "DEFAULT_REG_ID";
        System.out.println("Временный ID пользователя присвоен.");

    }

    UserProfile() {
        System.out.println("Создан профиль без имени.");
    }
    UserProfile(String name) {
        this.name=name;
        System.out.println("Создан профиль с именем: "+name);
    }
}
