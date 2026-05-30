package practice.level8;

public class task20 {
    public static void main(String[] args) {
        SchoolStudent newPupil = new SchoolStudent();
        newPupil.studentName = "Айдин";
        newPupil.setStudentAge(16);
        newPupil.displayStudentProfile();
    }

}

class SchoolStudent{
    public String studentName;
    private int studentAge;

        public void setStudentAge(int ageToSet) {
            studentAge+=ageToSet;

        }

        public void displayStudentProfile() {
            System.out.println(studentName);
            System.out.println(studentAge);
        }


}
