package day21;

public class Varargs01 {

    public static void main(String[] args) {

        add(1,2,3,4,5);
    }
    // Not 1: You cannot ude any other parameters after varargs.
    // before varargs we can use any other parameters
    // Varargs must be last parameters
    // you can use only a single varargs in a method parenthesis
    public static void add( int...a){
        int sum=0;
        for (int w: a){
           sum=sum+w;
        }
        System.out.println(sum);
    }

}
