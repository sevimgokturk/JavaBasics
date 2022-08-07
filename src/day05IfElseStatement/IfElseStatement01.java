package day05IfElseStatement;

import java.util.Scanner;

public class IfElseStatement01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a day...");
        String day=scan.next().toLowerCase();
        boolean isWeakDay=day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("Friday");
        boolean isWeekend=day.equals(day.equals("sunday")||day.equals("saturday"));

        if (isWeakDay){
            System.out.println(day+ " is weekday");
        }else if (isWeekend) {
            System.out.println(day+" is weekend day.");
        } else {
                System.out.println("enter correctly");
            }
        }




    }

