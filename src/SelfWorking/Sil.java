package SelfWorking;

import java.util.Scanner;

public class Sil {
    public static void main(String[] args) {

                 /*
Ask user to enter an integer.
If the integer is less than 100, tell user "Won!"
Otherwise, tell user "Lost!"
If user wins, ask another integer-until loosing.
 */
        Scanner scan= new Scanner(System.in);

        int n=0;

        do{
            System.out.println(" enter a integer:...");
            n=scan.nextInt();
            if(n<100){
                System.out.println("won!");//If user wins, ask another integer-until loosing.
            }

            }while (n<100);
        System.out.println("lost");//If user lost, stop.
        System.out.println("========================");
           /*
     Username is "admin", Password is "pwd123"
     Ask user to enter username and password
     User should see "Enter your username and password" message

     If he enters correct credentials he should get "You are in your account!" message

     Otherwise, he should see "Enter your username and password" message 3 times

     After 3 times he should get "Your account is blocked" message
 */

    String password = "";
    String username="";
    int counter=0;
    do{
        if(counter==3){
            System.out.println(" Your account is blocked!!");
            break;
        }
        System.out.println("enter sour password:");
        password=scan.next();
        System.out.println("enter your user name:");
        username=scan.next();
        if(password.equals("pwd123") && username.equals("admin")){
            System.out.println("You are in your account!");
            break;
        }
        counter++;

    }while (counter<4);














    }
}
