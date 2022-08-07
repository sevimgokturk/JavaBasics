package day10ForLoopWhileLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        /*//1.Example: Type 3 times Hello1 for 1, 3 times Hello2
        for 2, 3 times Hello3 for 3, 3 times Hello4 for 4 on the console

         */
        for (int i=1; i<5; i++) {
            for (int k = 1; k < 4; k++) {

                System.out.println("hello" + i);
            }

        }
        /*
        //    2.Example:Type code to get the output like
        //                Week: 1
        //                  Day: 1
        //                  Day: 2
        //                  Day: 3
        //                  .....
        //                Week: 2
        //                  Day: 1
        //                  Day: 2
        //                  Day: 3
        //                  ....
        //                Week: 3
        //                  Day: 1
        //                  Day: 2
        //                  Day: 3
        //                  ....
         */


        for (int i=1; i<5; i++) {
            System.out.println("week"+i);
            for (int k = 1; k < 4; k++) {

                System.out.println("day" + k);
            }

        }

       /*
    Write a Java Program to Print Rectangle Star Pattern using For Loop
    ****
    ****
    ****
    get the number of rows and colons from user
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter rows");
        int raws=scan.nextInt();
        System.out.println("enter colons");
        int colons=scan.nextInt();
        for (int i=1 ; i<raws+1; i++){
            for (int k=1; k<colons+1;k++){
                System.out.print("*");
            }
            System.out.println();

        }
                /*
            6.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
         */

        for (int a=1; a<6; a++){
            for (int b=1; b<=a; b++){

                System.out.print(b);
            }

            System.out.println();
        }









    }
}
