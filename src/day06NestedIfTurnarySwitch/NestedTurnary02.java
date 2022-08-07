package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class NestedTurnary02 {
    /*
       Type java code by using nested ternary.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
                If a year is not divisible by 100 then it must be divisible by 4
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String psw=scan.nextLine();
        String answer = (psw.length()>8)?(psw.charAt(0)=='i'?"fine":"not fine"):(psw.charAt(0)=='K'?"fine":"not fine");
        System.out.println(answer);

    }
}

