package day04ScannerIfStatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Ask user to enter a day name then
//print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
//print "Weekend Day" for Saturday and Sunday

       Scanner scan=new Scanner(System.in);
        System.out.println("enter a day...");
        String day=scan.next().toLowerCase();

        if (day.equals("monday")){
            System.out.println(day +" is a weekday.");
        }
        if(day.equals("tuesday")){
            System.out.println(day+" is a weekday.");
        }
        if (day.equals("wednesday")){
            System.out.println(day+" is a weekday.");
        }
        if (day.equals("Friday")){
            System.out.println(day+" is a weekday.");
        }
        if (day.equals("sunday")){
            System.out.println(day+" is  weekend day.");
        }
        if (day.equals("saturday")){
            System.out.println(day+" is  weekend day.");
        }
        else {
                System.out.println(day+" is not a days of week.");
                 }





    }
}
