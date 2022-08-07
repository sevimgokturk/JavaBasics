package day04ScannerIfStatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Ask user to enter an integer then
        //print "Even" if the integer is even
        //print "Odd" if the integer is odd
        Scanner scan= new Scanner(System.in);
        System.out.println("enter an integer to check its even or odd ... ");
        int a = scan.nextInt();
        if(a%2==0 ){
            System.out.println("even");
        }
        if (a%2!=0){
            System.out.println("odd");
        }




    }
}
