package day14Static;

public class Student {
    String name;
    int year =2022;
    static int counter=1000;
    String studentId;

    public String setStudentId(){
        counter++;
        studentId= year+ "" +counter;
        return studentId;
    }


}
