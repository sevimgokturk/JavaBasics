package day14Static;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //Create an Array by getting array elements from user
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements will you store inside the array?");
        int len = scan.nextInt();
        String sArrays[]=new String[len];
       // System.out.println(Arrays.toString(sArrays));
        for(int i=0; i<len; i++){
            System.out.println("enter a string");
            // String  el= scan.next();
            // sArrays[i]= el;
            sArrays[i]= scan.next();// for less memory

        }
        System.out.println(Arrays.toString(sArrays));







    }
}
