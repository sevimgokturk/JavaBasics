package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class SeitchStatement02 {
    public static void main(String[] args) {
        /*
      If user enters 9 the code will print October, November, December
If user enters 5 the code will print May, June, July, August, September, October, November, December
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int monthNumber = scan.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("janurary");

            case 2:
                System.out.println("feburary");
            case 3:
                System.out.println("march");

            case 4:
                System.out.println("avril");


            case 5:
                System.out.println("may");

            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");

            case 8:
                System.out.println("augst");


            case 9:
                System.out.println("septembre");

            case 10:
                System.out.println("novembre");
            case 11:
                System.out.println("descembre");

            case 12:
                System.out.println("......");
            default:
                System.out.println("invalid number");
                break;



        }






    }
}
