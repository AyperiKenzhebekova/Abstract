package tapshyrma1608;

import java.util.Random;

public class Student extends Person {
    private String schoolName;
    private  int grade;
    private int examMark;

    public Student(String name, int age, String schoolName,int grade) {
        super(name, age);
        Random random = new Random();
        this.schoolName = schoolName;
        this.grade=grade;
        this.examMark= random.nextInt(10,101);
    }

     public Student(String schoolName, int grade){}
     @Override
    public void iAmAble(){
        System.out.println(" I am student  and I can get marks");
    }



     public String getSchoolName(){
         return schoolName;
     }

    public int getGrade() {
        return grade;
    }

    public int getExamMark() {
        return examMark;
    }
}
