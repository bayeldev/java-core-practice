package practice.level14;

public class task20 {
    public static void main(String[] args) {
        StudentProfile newStud = new StudentProfile();
    }
}

class StudentProfile {
    int studentGrade = 1;

    {
        System.out.println("Блок 1: grade = " + studentGrade);
        studentGrade = 5;

    }

    {
        System.out.println("Блок 2: grade = " + studentGrade);
    }
}
