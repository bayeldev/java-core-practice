package practice.level15;

public class task02 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Aidar", 15);
        System.out.println("Имя: "+person1.getMemeberName());
        System.out.println("Возраст: "+person1.getMemberAge());
    }
}

class Person1 {
    private String memeberName;
    private int memberAge;


    Person1(String memberName, int memberAge) {
        this.memeberName = memberName;
        this.memberAge = memberAge;
    }



   public String getMemeberName() {
        return memeberName;
   }

    public int getMemberAge() {
        return memberAge;

    }
}
