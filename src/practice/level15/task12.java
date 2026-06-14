package practice.level15;

public class task12 {
    public static void main(String[] args) {
        SchoolStudent student = new SchoolStudent(22);
        student.setCurrentAge(19);
        System.out.println(student.getCurrentAge());
    }
}

class  SchoolStudent {
    private int currentAge;

    SchoolStudent(int currentAge) {
        this.currentAge=currentAge;

    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int newAge) {
        if(newAge<0) {
            System.out.println("Внимание! Возраст студента не может быть отрицательным. Значение не обновлено.");
            return;
        } else {
            this.currentAge=newAge;
        }
    }
}
