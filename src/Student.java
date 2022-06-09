public class Student {

    Course fizik;
    Course mat;
    Course turkce;
    String studentName;
    String studentNo;
    String studentClass;
    double studentAverage;
    boolean isPass;

    Student(String studentName, String studentNo, String studentClass, Course mat, Course fizik, Course turkce) {

        this.studentName = studentName;
        this.studentNo = studentNo;
        this.studentClass = studentClass;
        this.mat = mat;
        this.fizik = fizik;
        this.turkce = turkce;
        this.studentAverage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int matSinav, int matSozlu, int fizikSinav, int fizikSozlu, int turkceSinav, int turkceSozlu) {

        this.mat.sinavNotu = matSinav;
        this.mat.sozluNotu = matSozlu;
        this.fizik.sinavNotu = fizikSinav;
        this.fizik.sozluNotu = fizikSozlu;
        this.turkce.sinavNotu = turkceSinav;
        this.turkce.sozluNotu = turkceSozlu;
        this.calcAverage();
    }

    void calcAverage() {

        this.studentAverage = (this.mat.getAverage() + this.fizik.getAverage() + this.turkce.getAverage()) / 3.0;

        if (this.studentAverage >= 55.0)
            this.isPass = true;

        else
            this.isPass = false;
    }

    void isPass() {
        if (this.isPass)
            System.out.println("Sayin " + this.studentName + " Donemi Basarili Bir Sekilde Gectiniz.");

        else
            System.out.println("Sayin " + this.studentName + " Donemden Kaldiniz.");
    }

    void printStudent() {

        System.out.println("Ogrenci Adi :" + this.studentName);
        System.out.println("Ogrenci No :" + this.studentNo);
        System.out.println("Ogrenci Sinifi :" + this.studentClass);
        System.out.println("===========================");
    }

    void printNote() {

        System.out.println(this.studentName + "'nin Ders Notlari\n");
        System.out.println(this.mat.courseName + " Sinav Notunuz :" + this.mat.sinavNotu);
        System.out.println(this.mat.courseName + " Sozlu Notunuz :" + this.mat.sozluNotu);

        System.out.println(this.mat.courseName + " Ders Ortalamaniz :" + this.mat.getAverage() + "\n");
        System.out.println(this.fizik.courseName + " Sinav Notunuz :" + this.fizik.sinavNotu);
        System.out.println(this.fizik.courseName + " Sozlu Notunuz :" + this.fizik.sozluNotu);

        System.out.println(this.fizik.courseName+ " Ders Ortalamaniz :" + this.fizik.getAverage() + "\n");
        System.out.println(this.turkce.courseName + " Sinav Notunuz :" + this.turkce.sinavNotu);
        System.out.println(this.turkce.courseName + " Sozlu Notunuz :" + this.turkce.sozluNotu);

        System.out.println(this.turkce.courseName + " Ders Ortalamaniz :" + this.turkce.getAverage() + "\n");
        System.out.println("Donem Ortalamaniz :" + this.studentAverage);
        this.isPass();
        System.out.println("===========================");
    }
}