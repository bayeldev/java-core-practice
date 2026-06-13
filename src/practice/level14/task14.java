package practice.level14;

public class task14 {
    public static void main(String[] args) {
        User anonim = new User();
        User named = new User("Diana");

        System.out.println(anonim.userName + " " + anonim.userAge);
        System.out.println(named.userName+" "+named.userAge);


    }
}

class User {
    String userName;
    int userAge;

    User() {
        this.userName="Unknown";
        this.userAge=0;
    }

    User(String userName) {
        this.userName = userName;
        this.userAge = 0;

    }
}
