package SelfWorking;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalQ5 {
    public static void main(String[] args) {
        /*

        5) Ask user to enter long two sentences.
        Then type a program to count all “words” in the sentences.
        For example; if user enters
        “Java is easy, if you study. Nothing is easy, if you do not study”
        output will be 14. Hint: Use split()
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter long two sentences");
        String sentence=scan.nextLine();
        String arr[]=sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of words= "+ arr.length);


    }








}
