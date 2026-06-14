package practice.level15;

public class task01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.memberName = "Alie";
//        person.memberAge = 16;
        System.out.println("Экземпляр Person создан. Прямой доступ к полям memberName и memberAge запрещён (private).");
    }
}

class Person {
    private String memberName;
    private int memberAge;


}
