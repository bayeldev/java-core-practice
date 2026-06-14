package practice.level15;

public class task03 {
    public static void main(String[] args) {
      Person2 person2 = new Person2("Diana", 18);

      person2.setMemberAge(-5);
        System.out.println(person2.getMemberAge());

        person2.setMemberAge(45);
        System.out.println(person2.getMemberAge());
    }
}

class Person2 {
    private String memberName;
    private int memberAge;

    Person2(String memberName, int memberAge) {
        this.memberName=memberName;
        this.memberAge=memberAge;


    }

    public String getMemberName() {
        return  memberName;

    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberName(String newName) {
        this.memberName=newName;


    }
    public void setMemberAge(int newAge) {
      if(newAge<0) {
          System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
          return;
      } else {
          this.memberAge=newAge;
      }
    }
}
