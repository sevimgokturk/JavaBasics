package practice01;

import java.util.Locale;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

      /*
Type a program that ask user their age and gender.
If age is greater or equal than 18 and if gender is male, then print man ,
If age is greater or equal than 18 and if gender is female then print woman
If age is less than 18 and if gender is male then print boy ,
If age is less than 18 and if gender is female then print girl on the console.
      */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter gender M or F :...");
        String gender=scan.next().toUpperCase();
        System.out.println("enter age");
        int age=scan.nextInt();
        if  (gender=="M"|| gender=="F"){
           if (age<=18 && gender=="M"){
               System.out.println("boy");
           }
           else if (age<=18&&gender=="F"){
               System.out.println("girl");
           }
           else if(age>18&& gender=="M"){
               System.out.println("man");
           }
           else if(age>18&&gender=="F"){
               System.out.println("woman");
           }
        }else {
            System.out.println("write correctly");
        }











    }
}
