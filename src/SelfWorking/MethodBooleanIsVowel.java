package SelfWorking;

import java.util.Scanner;

public class MethodBooleanIsVowel {
    /*
    Write a value-returning method, isVowel that returns the value true if a given character is a vowel,
    and otherwise returns false.
    In main() method accept a string from user and count number of vowels in that string
     */


    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.next().toLowerCase();

        int counter =0;
        for (char w :arrayVowels){
           for (int i=0; i<str.length();i++){
               if(w==str.charAt(i)){
                   counter ++;
               }
           }
        }

        System.out.println(str+ "  has vowel is "+ isVowel(str));
        System.out.println(str+ "  has " + counter +" vowel");
    }


    static char arrayVowels[]={'a','e','i','o','u','y'};


    public static boolean isVowel(String str){
        boolean result=false;
        for (char w : arrayVowels){
            for (int i=0; i<str.length(); i++){
                if(str.charAt(i)==w){
                    result=true;

                }
            }
        }

        return result;
    }






}
