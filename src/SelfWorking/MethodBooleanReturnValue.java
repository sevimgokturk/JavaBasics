package SelfWorking;

import java.util.Scanner;

public class MethodBooleanReturnValue {
    // ask: enter the price
    // 0 <price <50 ----> "cheep"
    /*
    create a boolean return type method
     */

    public static boolean isTeenager(int price){

        boolean result =false;

        if( price < 50){
            result=true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the price:");
        int price=scan.nextInt();
        if(isTeenager(price)) {
            System.out.println("cheep");
        }else {
            System.out.println(" expensive");
        }
    }


}