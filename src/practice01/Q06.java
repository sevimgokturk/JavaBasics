package practice01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

    /*
Ask user to enter an integer
Type java code by using nested if statement,
      If a number is even then check if it is divisible by 3 or not.
      If it is divisible by 3 the output will be "Perfect even number"
      otherwise, the output will be "Good even number."
      If the number is odd then check if it is divisible by 3 or not.
      If it is divisible by 3 the output will be "Perfect odd number"
      otherwise, the output will be "Good odd number."
      */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  number : ");
        int a = scan.nextInt();
        if (a%2==0){
            if(a%3==0){
                System.out.println("even perfect");
            }else {
                System.out.println("good even");
            }
        } else if(a%3==0){
            System.out.println("perfect odd");
        }else {
            System.out.println("good odd");
        }






    }
}
