package day24ObjectManipulation;

import java.util.Scanner;

public class Runner03 {
    /*
    Ask user their name and lastname
    Then generate an email for them
    concatenate  firstname and lastname
    and "@gmail.com" then print email for the user on the console
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        do{
            System.out.println("enter your name");
            String name=scan.nextLine();
            System.out.println("enter your last name:");
            String lastname= scan.nextLine();
            System.out.println(name+lastname+"@gmail.com");
            System.out.println();

        }while (true);



    }
}
