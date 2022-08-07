package day12Constructor;

public class MethodAndOverloading02 {

    public static void main(String[] args) {
        /*
        if you have multiple methods whose names are same
        java looks at the parameter to select a specific method

        if you have multiple
         */


        System.out.println(add(2,5));
        System.out.println(add(3,6));
        sub(10,2);
        System.out.println(add(10,12,13));
        System.out.println(add(3.3,6.5));
        System.out.println(add(3.5,6.5));
        System.out.println(add(3,6.5));




    }
    //1)if you use a method inside the main method
    // you should add static keyword
    // between access modifier and the return type

    //2)


    //create an add methode withe 2 integer
    public static int  add (int a, int b){

       return a+b;

    }
    // create  an add method 3 parameters
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    // create  an add method 2 doubles parameters
    public static double add(double a, double b){
        return a+b;
    }
    // add one int one double
    public static double add(int a, double b){
        return a+b;
    }

    public static void  sub(int a,int b){ //if we add void don't need to return
        System.out.println(a-b);
    }




}
