package practice08;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         * Ask user to enter 2 positive integer then find
         * GCD (The Greatest Common Divisor) and
         * (if user enter 30 and 40 GCD = 10 )
         */

        Scanner scan1= new Scanner(System.in);
        System.out.println("enter a number: ");
        Integer num11=scan1.nextInt();
        System.out.println("enter a number: ");
        Integer num22=scan1.nextInt();
        int gcd1=1;
        for(int i =1; i<100; i++){
            if(num11%i==0 && num22%i==0){
              gcd1=gcd1*i;
            }
        }
        System.out.println(Math.sqrt(gcd1));

        //hocanin cozumu:
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 positive integers..");
        int num1 = Math.abs(scan.nextInt());
        int num2 = Math.abs(scan.nextInt());

        int gcd = 1;

        for(int i =1; i <= num1 && i<= num2; i++){
            if(num1 % i == 0  && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor of " + num1 + " and " + num1 + " is " + gcd);







    }
}
