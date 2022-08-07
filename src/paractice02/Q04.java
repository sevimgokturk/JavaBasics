package paractice02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
         /*
     Type a program to check if a positive number is perfect or not
     For example if the number is 6, we should see
     Perfect Number
     on the console.
     (The factors of 6 are : 1,2,3,6
     1+2+3=6  ==> it is perfect number )
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter int");
        int integer= scan.nextInt();
        int sum=0;
        for(int i =1; i<integer;i++ ){
            if(integer%i==0){
                sum=sum+i;}
            }if(sum==integer){
                System.out.println("perfect");
            }else {
                System.out.println("not perfect");
            }







    }
}
