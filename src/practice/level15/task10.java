package practice.level15;

public class task10 {
    public static void main(String[] args) {
        StudentProfile profile = new StudentProfile(16);

        profile.setStudentAge(22);

        System.out.println(profile.getStudentAge());
    }
}

class StudentProfile {
    private int studentAge;

    StudentProfile(int studentAge) {
        this.studentAge=studentAge;

    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int newAge) {
        this.studentAge = newAge;
    }

}

