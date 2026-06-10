package practice.level11;

public class task12 {
    public static void main(String[] args) {
        try {
            validateUserName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateUserName(String name) {

        try {
            if(name.equals("")) {
                throw new IllegalArgumentException("Регистрация отклонена: Имя пользователя не может быть пустым.");
        }

        } finally {
            System.out.println("Проверка имени пользователя завершена.");

        }
    }

}
