package paractice02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
            /*
         Ask user to enter a name and a character,
         then check how many times the character is repeated
         in the name by using for loop(make code case-sensitive)
        Example:
        INPUT      :char ch1= 'a' ;
                    String name =“John came late";
        OUTPUT :  a is repeated 2 times in this String
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a name:.... ");
        String  str= scan.next();
        System.out.println("enter a character:...");
        char chr = scan.next().charAt(0);

        
        String chrS=String.valueOf(chr);
        int sum=0;
        for (int i=0; i< str.length()-1 ; i++){
            String str1= str.substring(i,i+1);
            if(str1.contains(chrS)){
                sum=sum+1;
            }

        }
        System.out.println(chr+" is repeated "+ sum+ " times in this String");


        System.out.println("==================================");
        int sum1=0;
        for (int i=0; i< str.length()-1 ; i++){
            if(chr==str.charAt(i)){
                sum1++;
            }

        }
        System.out.println(chr+" is repeated "+ sum1+ " times in this String");





    }
}
