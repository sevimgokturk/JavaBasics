package day20practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    /* Type a code that takes array and
   returns the difference between the biggest and the smallest numbers.
   Ask user to enter array elements.
 */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter length:");
        int length= scan.nextInt();
        int array[]= new int[length];

        int i=0;
        do{
            System.out.println("enter an element:");
            array[i]=scan.nextInt();
         i++;
        }while ((i<length));
        Arrays.sort(array);
        System.out.println(array[0]+"-"+array[length-1]);

    }
}
