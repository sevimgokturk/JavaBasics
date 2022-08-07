package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
         Anagram is to create a new word from other word's characters.
        * Write java code to check if two words are anagram or not
        * isAnagram("listen", "Silent") ==> anagram
        * Dormitory = Dirty room
        * School master = The classroom
        * Conversation = Voices rant on
        * Listen = Silent
        * Astronomer = Moon starer
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enet a string");
        String str1= scan.nextLine();
        System.out.println("enet a string");
        String str2= scan.nextLine();


        System.out.println(isAnagram(str1,str2));

    }

    public static String isAnagram (String str1,String str2 ){

        String s1[]=str1.toLowerCase().replaceAll(" ","").split("");
        String s2[]= str2.toLowerCase().replaceAll(" ","").split("");
        Arrays.sort(s1);
        Arrays.sort(s1);
        if(Arrays.equals(s1,s2)){
            return "Anagram";
        }else {
            return "Not Anagram";
        }


    }


}
