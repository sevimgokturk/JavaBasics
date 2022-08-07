package day04ScannerIfStatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
       /* Get the firstname, middle name, lastname, SSN from user then print them like the following
        Ali Mert Can
        123456789*/
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your firs name ");
        String first= scan.next();

        System.out.println(" enter your second name ");
        String second= scan.next();

        System.out.println(" enter your firs name ");
        String third= scan.next();

        System.out.println(" enter your ssd number ");
        int  ssd= scan.nextInt();
        System.out.println(first+" "+second+" "+third);
        System.out.println(ssd);
        // Is one sentence enough for all inputs?
        //Scanner scan = new Scanner(System.in);
        // Is one sentence enough for all inputs?






    }
}
