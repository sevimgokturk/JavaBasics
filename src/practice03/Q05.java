package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /* Create an integer array by the help of user(ask user length and elements of array)
         * Ask user the index of element that user wants to remove.
         * Print the array on the console after removing
         */
        Scanner scan =new Scanner(System.in);
        System.out.println(" Enter length of array: ");
        int length= scan.nextInt();
        String ar[]=new String[length];
        int i=0;
        do{
            System.out.println("Enter a element");
            ar[i]=scan.next();
          i++ ;
        }while (i<length);
        System.out.println(Arrays.toString(ar));

        System.out.println("=================================");

        System.out.println("Enter the index of element that you wants to remove");
        int index=scan.nextInt();
        int c=0;
        String ar2[]=new String[length-1];
       do{
           ar2[c]=ar[c];
           c++;
       }while (c<index);

       int k =index;
       do{
           ar2[k]=ar[k+1];
           k++;
       }while (k<length-1);

        System.out.println(Arrays.toString(ar2));

        System.out.println("============================");















    }
}
