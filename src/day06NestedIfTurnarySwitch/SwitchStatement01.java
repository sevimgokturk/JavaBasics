package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class SwitchStatement01 {
    public static void main(String[] args) {
        /*
        get the number of day from user and print name of day
        first sunday
        monday
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int dayNumber = scan.nextInt();
        //solved by if else
        if (dayNumber==1){
            System.out.println("sunday");
        }else if(dayNumber==2){
            System.out.println("monday");
        }else if(dayNumber==3){
            System.out.println("t");
        }else if(dayNumber==4){
            System.out.println("w");
        }else if(dayNumber==5){
            System.out.println("th");
        }else if(dayNumber==6){
            System.out.println("f");
        }else if(dayNumber==7){
            System.out.println("sat");
        }else {
            System.out.println("less than 8 pls.");
        }
        // solved by switch
        //if you have more than 3 options switch is better.
    switch (dayNumber){
        case 1:
            System.out.println("sunday");
            break;

        case 2:
            System.out.println("monday");
            break;

        case 3:
            System.out.println("t");
            break;

        case 4:
            System.out.println("w");
            break;
        case 5:
            System.out.println("th");
            break;
        case 6:
            System.out.println("f");
            break;

        case 7:
            System.out.println("saturday");
            break;
        default:
            System.out.println("Invalid day number");
            break;// dont need that
    }






    }
}
