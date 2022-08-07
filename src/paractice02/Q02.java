package paractice02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*
         Write a Java program to take the last three characters
         from a given string and add these three characters
          at both the front and back of the string.
         String length must be at least three and more.
            INPUT      : Ankara
            OUTPUT  : araAnkaraara */


        Scanner scan=new Scanner(System.in);
        System.out.println("enter a str:...");
        String str=scan.next();
        String first3str=str.substring(0,3);
        String lastStr=str.substring(3);
        String newStr= lastStr+str+first3str;
        if(str.length()>3) {
            System.out.println(newStr);
        }else {
            System.out.println("String length must be at least three and more.");
        }






    }

    }



