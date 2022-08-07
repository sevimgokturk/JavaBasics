package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class NestedTenary01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a year...");
        int m=scan.nextInt();
        String answer= (m%100==0)?(m%400==0?"leap year":"not leap year"):(m%4==0?"leap year":"not leap");
        System.out.println(answer);


    }
}
