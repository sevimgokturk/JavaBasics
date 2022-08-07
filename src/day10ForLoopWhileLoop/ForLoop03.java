package day10ForLoopWhileLoop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {
        //Type code to find the sum of the digits of an

        Scanner scan=new Scanner(System.in);
        System.out.println("write a integer:");
        int integer= scan.nextInt();
        int sum=0;
        int reminder=0;
        while (integer>0){
            reminder =integer%10;
            sum=sum+reminder;
            integer=integer/10;
        }
        System.out.println(sum);

        int sum1=0;
        int integer1=777;
        for (int i=integer1; i>0;  i=i/10){
            sum1=sum1+i%10;

        }
        System.out.println(sum1);
    }
}
