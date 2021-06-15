package OgrenciNotSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){

        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printTeacher(){
        System.out.println("Name: "+ this.name);
        System.out.println("Phone: "+ this.mpno);
        System.out.println("Section: "+ this.branch+"\n");
    }

}
