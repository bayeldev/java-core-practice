package practice.level15;

public class task05 {
    public static void main(String[] args) {
            UserCard card = new UserCard("Diana");
        System.out.println(card.getUserName());
    }
}

class UserCard {
    private String UserName;

    UserCard(String UserName) {
        this.UserName=UserName;
    }

    public String getUserName() {
        return UserName;
    }
}