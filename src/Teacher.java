public class Teacher {

    String teacherName;
    String phoneNumber;
    String teacherBranch;

    Teacher(String teacherName, String phoneNumber, String teacherBranch) {
        this.teacherName = teacherName;
        this.phoneNumber = phoneNumber;
        this.teacherBranch = teacherBranch;
    }

    void printTeacher() {
        System.out.println("Ogretmen Adi :" + this.teacherName);
        System.out.println("Ogretmen Bransi :" + this.teacherBranch);
        System.out.println("Ogretmen Telefon No:" + this.phoneNumber);
        System.out.println("===========================");
    }
}