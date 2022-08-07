package lamda_functional_programing;

import java.util.stream.IntStream;

public class FP05 {
    public static void main(String[] args) {
        //1)Create a method to find the sum of integers from 7 to 100 (7 and 100 inclusive)
        System.out.println(getSum());
        System.out.println(getMult());
        System.out.println(getFactorial(-5));
        System.out.println(getFactorial(5));
    }
    public static int getSum(){
        //intSteram method does the same actions as for loop does in structure programing
        // return IntStream.range(7,101).sum();
        // return IntStream.range(7,101).reduce(0,Math::addExact);
        return IntStream.rangeClosed(7,100).sum();
    }

//2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int getMult(){
        return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }
    //3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static Object getFactorial(int num){
        return num>=0 ? IntStream.rangeClosed(1,num).reduce(1,Math::multiplyExact) : "dont enter negative number";
    }




}
