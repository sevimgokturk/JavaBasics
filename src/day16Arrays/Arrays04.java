package day16Arrays;

import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        //1)Get string from user and type code to find the number of words in a String.
        //2)Count how many words starts with "a".(Make code case-sensitive)
        Scanner scan = new Scanner(System.in);
        System.out.println("enter");
        String word=scan.nextLine();
        String array[]=word.split(" ");
        System.out.println("the number of words :" +array.length);
        int counter=0;
        for (String w:array){
            if(w.startsWith("a")) {
                counter++;
            }
        }
        System.out.println(counter);



    }
}
