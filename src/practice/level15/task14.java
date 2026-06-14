package practice.level15;

public class task14 {
    public static void main(String[] args) {
        StudentIdentityCard studentIdentityCard = new StudentIdentityCard("Alica");

//        studentIdentityCard.studentName = "Bob";

        System.out.println(studentIdentityCard.getStudentName());
    }
}

class StudentIdentityCard {
    private final String studentName;


    StudentIdentityCard(String studentName) {
        this.studentName=studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}