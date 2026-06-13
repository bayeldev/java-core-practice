package practice.level14;

public class task16 {
    public static void main(String[] args) {
        MyStudent full = new MyStudent("Байэл", "Математика", 100);
        MyStudent noScore = new MyStudent("Айдар", "История");
        MyStudent nameOnly = new MyStudent("Диана");
        MyStudent empty = new MyStudent();

        printStudent(full);
        printStudent(noScore);
        printStudent(nameOnly);
        printStudent(empty);


    }

    private static void printStudent(MyStudent s) {
        System.out.printf("Имя: %s, Группа: %s, Балл: %d\n", s.studentName, s.studentGroup, s.studentScore);
    }
}

class MyStudent{
    String studentName;
    String studentGroup;
    int studentScore;

    MyStudent(String studentName, String studentGroup, int studentScore) {
        this.studentName=studentName;
        this.studentGroup=studentGroup;
        this.studentScore=studentScore;
    }

    MyStudent(String studentName, String studentGroup) {
        this.studentName=studentName;
        this.studentGroup=studentGroup;
        this.studentScore=0;
    }

    MyStudent(String studentName) {
        this.studentName=studentName;
        this.studentGroup="Unknown";
        this.studentScore=0;
    }

    MyStudent() {
        this.studentName="Unknown";
        this.studentGroup="Unknown";
        this.studentScore=0;
    }
}