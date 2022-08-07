package day10ForLoopWhileLoop;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //type code to print hello 5 times
        int i=0;
        while (i<6){
            System.out.println("hello!");
            i++;
        }
        System.out.println("=====================");
        for (int c=1; c<6; c++){
            System.out.println("hello!");
        }
        System.out.println("======================");

//type code to print odd int
        int b=12;
        while (b<67){
            if(b%2!=0)
                System.out.print(b + "-");
                b++;

        }
        System.out.println();
        //3.Example: Type code to find the sum of integers from 12 to 67
        System.out.println("==================");

        int z=12;
        int sum=0;
        while (z<67){
            sum= sum+z;
            z++;
        }
        System.out.println(sum);


        //type get int write sum of digits

        Scanner scan = new Scanner(System.in);
        System.out.println("enter");
        int num=scan.nextInt();
        int sum1=0;
        while (num>0){
            sum1 = sum1 + num%10 ;
            num = num/10;
        }
        System.out.println(sum1);

        /*
		 Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.

	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	 */
        int n=3;
       int k=1;
       while (k<11){

           System.out.println(n+"X"+ k +"="+n*k);

           k++;
       }




    }
}
