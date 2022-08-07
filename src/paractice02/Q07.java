package paractice02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
         /*
     Get the number of rows from user then draw a right triangle by using asterixs
     Number of rows = 4 ==>    *
                               * *
                               * * *
                               * * * *
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("enter Number of rows:..");
        int rows=scan.nextInt();
        for (int i=1; i<rows+1; i++){
            System.out.print("*".repeat(i));
            System.out.println();
        }
        System.out.println("======================================");

        for (int i=1; i<rows+1; i++){
            for (int c=1; c<i+1;c++){
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
