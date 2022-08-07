package practiceExtra;

import java.util.Arrays;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

           /*
     Interview Question
Create a code that takes an array and
returns the difference between the biggest and the smallest numbers.
  Ask user to enter array elements.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of an array  ");
        int length = scan.nextInt();

        int ar[]= new int[length];
        for(int i =0; i<length; i++){
            System.out.println("enter a element of array: ");
            ar[i] = scan.nextInt();
        }

        int max = ar[0];
        int min = ar[0];
        for (int i=0 ; i <length; i++){
            max= (ar[i]>max ?  ar[i] : max);
            min= (ar[i]<min ? ar[i] : min);

        }
        System.out.println("max-min = "+(max-min)) ;
        Arrays.sort(ar);
        System.out.println("max-min = "+ (ar[length-1]-ar[0]));




    }
}
