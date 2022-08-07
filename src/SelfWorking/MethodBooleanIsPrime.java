package SelfWorking;

import java.util.Scanner;

public class MethodBooleanIsPrime {
    /*
    A prime number is a number that is evenly divisible only by itself and 1.
    For example, the number 5 is prime because it can be evenly divided only by 1 and 5.
    The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
    Write a method named c, which takes an integer as an argument
    and returns true if the argument is a prime number, or false otherwise.
    Also write main method that displays prime numbers between 1 and 500.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a integer between 1 and 500 :  ");
        int integer= scan.nextInt();
        System.out.println(integer+" is a prime number is "+isPrime(integer));
        for (int i=1; i<501; i++) {
            if(isPrime(i)==true){
                System.out.print(i+" - ");
            }
        }

    }
    public  static boolean isPrime (int integer){
        boolean result = true;
       for (int i=2; i<integer; i++) {
           if (integer % i == 0 ){
               result= false;
           }
       }
        return result;
    }




}
