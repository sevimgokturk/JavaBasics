package paractice02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
         /*
     Type a program:
     For numbers which are a multiple of 3, print "Rock"
     instead of number,
     and for numbers which are a multiple of 5, print "Star"
     instead of the number.
     For numbers which are a multiple by of both 3 and 5,
     print "RockStar" instead of the number.
     Use for loop.
     EXAMPLE:
     int num = 15;
     OUTPUT :  1 2 Rock 4 Star Rock 7 8 Rock Star 11 Rock 13 14 RockStar
         */
        int num=12;
        if (num%3==0){
            if(num%5==0){
                System.out.println("Rock Star");
            }else {
                System.out.println("Rock");
            }
        }else if (num%5==0 && num%3!=0){
            System.out.println("Star");
        }else{
            System.out.println(" not multiple by 3 or/and 5 ");
        }
        System.out.println("===================================FOR LOOP:");

        for ( int i=3; i<6; i=i+2){
            if(num%i==0 && i<5){
                System.out.println("Rock");
            }else if(num%i==0 && i<6){
                System.out.println("Rock Star");
            }else  if(num%i==0 && i>3){
                System.out.println("Star");
            }else {
                System.out.println(" not multiple by 3 or/and 5 ");
            }
        }
        System.out.println("============================================");
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a int:....");
        int integer=scan.nextInt();
        for (int i=0; i<integer+1; i++){
            if (i%3==0){
                if(i%5==0){
                    System.out.println(i+"Rock Star");
                }else {
                    System.out.println(i+"Rock");
                }
            }else if (i%5==0 && i%3!=0){
                System.out.println(i+"Star");
            }else{
                System.out.println(i+" not multiple by 3 or/and 5 ");
            }

        }







    }
}
