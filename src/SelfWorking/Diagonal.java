package SelfWorking;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        // create a diagonal that you received from user
        // row=4...> *
        //            *
        //             *
        //              *

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a row:");
        int row = scan.nextInt();

        for (int i = 1; i < row + 1; i++) {
            for (int c = 1; c < i + 1; c++) {
                if (i == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("==============================");
        // without  diagonal
        //  *****
        // * ****
        // ** ***
        // *** **
        // **** *
        // *****

        for (int i = 1; i < row + 1; i++) {
            for (int c = 1; c < row + 1; c++) {
                if (i == c) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        /* diagonal


           |*   |
           | *  |
           |  * |
           |   *|


         */
        for (int i = 1; i < row ; i++) {
            for (int c = 1; c < i+row-1 ; c++) {
                if(c==1 || c==row){
                    System.out.print("|");
                }else if (i == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }







        }
    }
