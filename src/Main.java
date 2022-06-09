public class Main {

    public static void main(String[] args) {

        Teacher sumeyye = new Teacher("Sumeyye Selvi", "123", "MTK");
        Teacher yasir = new Teacher("Yasir Selvi", "456", "FZK");
        Teacher busra = new Teacher("Busra Selvi", "789", "TRK");

        Course fizik = new Course("Fizik", "101", "FZK", 0.6, 0.4);
        fizik.addTeacher(yasir);

        Course mat = new Course("Matematik", "102", "MTK", 0.8, 0.2);
        mat.addTeacher(sumeyye);

        Course turkce = new Course("Turkce", "103", "TRK", 0.5, 0.5);
        turkce.addTeacher(busra);

        Student halil = new Student("Halil Selvi", "1", "9", mat, fizik, turkce);
        Student musab = new Student("Musab Selvi", "2", "9", mat, fizik, turkce);
        Student azra = new Student("Azra Selvi", "3", "9", mat, fizik, turkce);

        halil.addBulkExamNote(60, 60, 60, 70, 80, 85);
        musab.addBulkExamNote(50, 50, 80, 80, 85, 89);
        azra.addBulkExamNote(50, 50, 65, 75, 90, 95);


    }
}