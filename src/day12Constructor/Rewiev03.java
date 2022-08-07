package day12Constructor;

public class Rewiev03 {
    public static void main(String[] args) {
        System.out.println(add(2.5,6));
        System.out.println(sub(9.8,10));
        sub(9,6);



    }
    public static double add (double a ,int b){
        return a+b;

    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static void add(int a, int b){ //if we add void don't need to return
        System.out.println(a + b);
    }



}
