public class Course {

    Teacher teacher;
    String courseName;
    String courseCode;
    String coursePrefix;
    int sinavNotu;
    int sozluNotu;
    double sinavEtki;
    double sozluEtki;
    double courseAverage;

    Course(String courseName, String courseCode, String coursePrefix, double sinavEtki, double sozluEtki) {

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.coursePrefix = coursePrefix;
        this.sinavEtki = sinavEtki;
        this.sozluEtki = sozluEtki;
        this.sinavNotu = 0;
        this.sozluNotu = 0;
        this.courseAverage = 0.0;
    }

    void addTeacher(Teacher teacher) {

        if (this.coursePrefix.equals(teacher.teacherBranch))
            this.teacher = teacher;

        else
            System.out.println("Brans Uyumsuz!");
    }

    void printTeacher() {

        System.out.println("Ogretmen Isim :" + this.teacher.teacherName);
        System.out.println("Ogretmen Bransi :" + this.teacher.teacherBranch);
        System.out.println("Ogretmen Telefon Numarasi :" + this.teacher.phoneNumber);
        System.out.println("===========================");
    }

    double getAverage() {

        this.courseAverage = (this.sinavNotu * this.sinavEtki) + (this.sozluNotu * this.sozluEtki);
        return this.courseAverage;
    }

    void printCourse() {

        System.out.println("Ders Adi :" + this.courseName);
        System.out.println("Ders Kodu :" + this.courseCode);
        System.out.println("Ders Kisaltimi :" + this.coursePrefix);
        this.teacher.printTeacher();
    }
}