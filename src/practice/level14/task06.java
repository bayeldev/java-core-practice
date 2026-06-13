package practice.level14;

public class task06 {
    public static void main(String[] args) {
        Student1 newStudent = new Student1("Алиса" , 95);

        System.out.println("Имя:  "+ newStudent.studentName + ", оценка:  "+ newStudent.studentGrade);
    }
}

class Student1 {
    String studentName;
    int studentGrade;


    public Student1(String studentName, int studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;

    }
}
