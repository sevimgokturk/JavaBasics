package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name: " );
        String name = scan.nextLine().toUpperCase();
        System.out.println("You are "+ name+ ".");


        Scanner scan1 = new Scanner(System.in);
        System.out.println("price: " );
        double d= scan1.nextDouble();
        System.out.println("price is : " + d );


        // is it possible to convert




    }

}
