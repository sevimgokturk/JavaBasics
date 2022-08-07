package day04ScannerIfStatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
Type a program which calculates the volume of a rectangular prism whose length, width, and height are entered by user.
    Hint: Volume of a rectangular prism is width x length x height
 */
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter width ");
        double a = scan.nextDouble();
        System.out.println("enter length: ");
        double b = scan.nextDouble();
        System.out.println("enter height: ");
        double c = scan.nextDouble();
        System.out.println("volume=" + a*b*c);




    }
}
