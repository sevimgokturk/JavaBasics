package day05IfElseStatement;

import java.util.Scanner;

public class AgesAndStages {
    public static void main(String[] args) {
        //0 - 4 => baby
//5 - 12 => child
//13 - 20 => teenager
//21 - 30 => adult
//else (not expected age)
        Scanner scan=new Scanner(System.in);
        System.out.println("write your age");
        int age=scan.nextInt();
        if (age < 5){
            System.out.println("baby");
        } else if (age>4 && age<13){
            System.out.println("child");
        } else if (age>12 && age<21){
            System.out.println("teenager");
        } else if (age>20 && age<31){
            System.out.println("adult");
        }else {
            System.out.println("not expected age");
        }


    }
}
