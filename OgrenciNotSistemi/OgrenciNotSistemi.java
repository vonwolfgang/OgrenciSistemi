package OgrenciNotSistemi;

public class OgrenciNotSistemi{
    public static void main(String[] args){

        Teacher t1 = new Teacher("Mahmut", "1234", "FZK");
        Teacher t2 = new Teacher("Ahmet", "3245", "BIO");
        Teacher t3 = new Teacher("Mehmet", "1098", "MAT");

        Course fizik = new Course("Fizik", "101", "FZK", 90, 70);
        fizik.addTeacher(t1);
        Course biology = new Course("Bilogy", "101", "BIO", 100, 20);
        biology.addTeacher(t2);
        Course matematik = new Course("Matematik", "101", "MAT", 90, 60);
        matematik.addTeacher(t3);

        Student stu1 = new Student("Ahmet", 1010, "12", fizik, biology, matematik);
        stu1.addBulkExamNote(fizik.note, biology.note, matematik.note, fizik.sozNote, biology.sozNote, matematik.sozNote);
        stu1.printNote();
        stu1.calcAverage();
        stu1.isPass();
    }
}



