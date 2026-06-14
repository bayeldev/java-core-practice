package practice.level15;

public class task17 {
    public static void main(String[] args) {
        new ApplicationModule();
    }
}

class ApplicationModule {
    public static String moduleStatusMessage;

    static {
        String moduleStatusMessage = "Приложение: Главный модуль готов к работе!";
        System.out.println(moduleStatusMessage);
    }

    public ApplicationModule () {

    }
}
