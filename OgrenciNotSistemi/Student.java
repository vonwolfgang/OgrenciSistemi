package OgrenciNotSistemi;

public class Student {
    
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;

    Student(String name, int stuNo, String classes, Course course1, Course course2, Course course3){

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    void addBulkExamNote(int note1, int note2, int note3, int sozNote1, int sozNote2, int sozNote3){
        if(note1>=0 && note1<= 100){
            this.course1.note = note1;
        }
        if(note2>=0 && note2<= 100){
            this.course2.note = note2;
        }
        if(note3>=0 && note3<= 100){
            this.course3.note = note3;
        }
        if(sozNote1>=0 && sozNote1<= 100){
            this.course1.sozNote = sozNote1;
        }
        if(sozNote2>=0 && sozNote2<= 100){
            this.course2.sozNote = sozNote2;
        }
        if(sozNote3>=0 && sozNote3<= 100){
            this.course3.sozNote = sozNote3;
        }
        
    }

    void isPass(){
        if(this.average >= 60){
            System.out.println("Weldone you passed");
        }
        else{
            System.out.println("You failed");
        }
    }

    void calcAverage(){
        this.average = (((this.course1.note*0.8)+(this.course1.sozNote*0.2)) + ((this.course2.note*0.8)+(this.course2.sozNote*0.2)) + ((this.course3.note*0.8)+(this.course3.sozNote*0.2)))/3;
        
        System.out.println("Your average is: " + this.average);
    }

    void printNote(){
        System.out.println("=================================================");
        System.out.println("Student's name is " + this.name);
        System.out.println(this.course1.name + " Not: " + this.course1.note + " Sozlu Notu: " + this.course1.sozNote);
        System.out.println(this.course2.name + " Not: " + this.course2.note+ " Sozlu Notu: " + this.course2.sozNote);
        System.out.println(this.course3.name + " Not: " + this.course3.note+ " Sozlu Notu: " + this.course3.sozNote);

    }

}
