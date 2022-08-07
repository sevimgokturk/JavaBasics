package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a password

		If the initial of the password is uppercase then check if it is ‘A’ or not.
		If it is ‘A’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

		If the initial of the password is lowercase then check if it is ‘z’ or not.
		If it is ‘z’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a password:....");
        String psw= scan.nextLine();
        // how to get first character of string
        /*
        if its possible do not use nested if because its time complexity
        takes too much time

         */
        char firstCharacter=psw.charAt(0);
        if(firstCharacter>='A'&& firstCharacter<='Z'){
            if(firstCharacter=='A'){
                System.out.println("Valid Password");

            }else {
                System.out.println("Invalid Password");
            }

        }else if(firstCharacter>='a'&& firstCharacter<='z'){
            if(firstCharacter=='z'){
                System.out.println("Valid Password");

            }else {
                System.out.println("Invalid Password");
            }

        }else {
            System.out.println("Invalid Password");
        }




    }
}
