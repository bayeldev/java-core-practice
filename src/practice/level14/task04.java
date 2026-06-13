package practice.level14;

public class task04 {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        firstStudent.studentName = "Анна";
        firstStudent.enrollmentYear = 2022;
        firstStudent.sayHello();
        secondStudent.studentName = "Иван";
        secondStudent.enrollmentYear = 2023;
        secondStudent.sayHello();

    }
}

class Student {
    String studentName;
    int enrollmentYear;
    void sayHello() {
        System.out.printf("Имя: %s, год поступления: %d", studentName, enrollmentYear);
        System.out.println();
    }
}
