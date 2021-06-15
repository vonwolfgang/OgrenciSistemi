package OgrenciNotSistemi;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note, sozNote;

    Course(String name, String code, String prefix, int note, int sozNote){

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.sozNote = sozNote;
    }

    void addTeacher(Teacher teacher){

        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;    
        }
        else{
            System.out.println("branch and teacher is not fit eachother");
        }
    }

    void printTeacher(){
        this.teacher.printTeacher();
    }
}
