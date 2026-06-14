package practice.level15;

public class task19 {
    public static void main(String[] args) {
        new SystemComponent();
        new SystemComponent();
    }
}

class SystemComponent {

    static {
        System.out.println("Глобальная инициализация: Шаг 1");
    }
    static {
        System.out.println("Глобальная инициализация: Шаг 2");
    }
    {
        System.out.println("Инициализация компонента: Шаг А");
    }
    {
        System.out.println("Инициализация компонента: Шаг Б");
    }
    SystemComponent() {
        System.out.println("Компонент полностью настроен и готов!");
    }
}
