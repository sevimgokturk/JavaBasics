package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("enter w: and h: " );
        double w = scan1.nextDouble();
        // System.out.println("enter w: " )
        double h = scan1.nextDouble();
        System.out.println("area is : " + w*h );
        System.out.println("The perimeter is "+(w+h));

    }
}
