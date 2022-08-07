package SelfWorking;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    // write a program that fills an array with n integer entered by user.
    // suppose that the user: enter at least 1 number and most 10 number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of an array which is least 1 number and most 10 number: ");
        int length = scan.nextInt();

        while (length <1 || length > 10) {
            System.out.println("enter again (which is least 1 number and ost 10 number) :...");
            length=scan.nextInt();
        }

        int ar[]= new int[length];
        for(int i =0; i<length; i++){
            System.out.println("enter a element of array: ");
            ar[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(ar));






    }
}
