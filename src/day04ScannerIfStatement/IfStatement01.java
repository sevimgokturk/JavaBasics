package day04ScannerIfStatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println(" enter your firs name ");
        String first= scan.next();*/
        // if(conditions){ action }
        //If it rains , I will cancel the picnic
        //condition   ,    action

//      if(If it rains) {
//            I will cancel the picnic
//      }

        /*
         If you want to run different codes for different conditions you should use "if statement"
         */
        //Ask user to enter an integer, then
//print "Positive" on the console if the number is positive
//print "Negative" on the console if the number is negative
//print "Neuter" on the console if the number is zero

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a integer");
        int num = scan.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        if(num<0){
            System.out.println("negative");
        }
        if (num == 0){
            System.out.println("neuter");

        }






    }
}
