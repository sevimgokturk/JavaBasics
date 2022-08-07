package day05IfElseStatement;

import java.util.Scanner;

public class IfElseStatement02 {
    public static void main(String[] args) {
        //Type a code to print its season after getting a month from user.
        //December, January, February.....> Winter
        // March,April, May,........> Spring
        // June, July, August,.......> summer
        // September, October, November......> fall

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a mouth of the years...");
        String m=scan.next();
        if(m.equalsIgnoreCase("December")||m.equalsIgnoreCase("January")||m.equalsIgnoreCase("February") ){
            System.out.println(m+" is month of winter ");
        }
        else if(m.equalsIgnoreCase("March")||m.equalsIgnoreCase("April")||m.equalsIgnoreCase("May") ){
            System.out.println(m+" is month of spring ");
        }
        else if(m.equalsIgnoreCase("June")||m.equalsIgnoreCase("July")||m.equalsIgnoreCase("August") ){
            System.out.println(m+" is month of summer ");
        }
        else if(m.equalsIgnoreCase("October")||m.equalsIgnoreCase("November") ){
            System.out.println(m+" is month of autumn ");
        } else {
            System.out.println("tape correctly.");
        }



    }
}
