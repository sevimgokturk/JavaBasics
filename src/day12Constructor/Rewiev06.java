package day12Constructor;


public class Rewiev06 {
    String name;
    int score;


    public Rewiev06(String name, int score){
        this.name=name;
        this.score=score;
    }

    public Rewiev06() {

    }


    public static void main(String[] args) {

        Rewiev06 student1 = new Rewiev06();

        student1.name="sevim";
        student1.score=100;


        System.out.println(student1.name+"  "+ student1.score);

        Rewiev06 student3 =new Rewiev06("nil", 100);
        Rewiev06  student2 = new Rewiev06("osman",100);
        System.out.println(student2.name+" "+ student2.score);
        System.out.println(student3.name+" "+ student3.score);

    }




}
