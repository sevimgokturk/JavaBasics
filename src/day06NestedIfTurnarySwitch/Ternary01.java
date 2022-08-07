package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
/*
If an integer is positive print “The integer is positive” otherwise print “The integer is not positive”

 */
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter");
        int a = scan.nextInt();
        if (a>0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
        // condition    question marc     result happy    colon    result negative
        //  num>0         ?                                 :
        String result = a>0 ? "positive": "negative";

        //Write a program to print the minimum of 2 integers on the console. Use ternary...
        Scanner scan1=new Scanner(System.in);
        System.out.println(" enter");
        int m=scan1.nextInt();
       int n=scan1.nextInt();
       int minimum = m < n ? m : n;
        System.out.println(minimum);







    }
}
