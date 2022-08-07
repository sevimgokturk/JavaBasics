package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        // absolut value
        //Type code to calculate the absolute value of a number
//For positive numbers nad zero absolute value is the same with the number
//For negative numbers to find absolute value multiply the number by -1
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        double a = scan.nextDouble();
        double m =a<0 ? a*-1 :a;
        System.out.println(m);



    }
}
