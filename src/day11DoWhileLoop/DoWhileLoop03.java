package day11DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {


        /*
     Username is "admin", Password is "pwd123"
     Ask user to enter username and password
     User should see "Enter your username and password" message

     If he enters correct credentials he should get "You are in your account!" message

     Otherwise, he should see "Enter your username and password" message 3 times

     After 3 times he should get "Your account is blocked" message
 */
        Scanner scan= new Scanner(System.in);

        String username="";
        String password ="";
        int counter=0;
        do{
            if(counter==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("enter user name");
            username=scan.next();
            System.out.println("enter password");
            password =scan.next();

            if(username.equals("admin") && password.equals("pwd123") ){
                System.out.println("you are in your account");
                break;
            }

            counter++;

        }while (counter<4);









    }
}