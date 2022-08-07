package day24ObjectManipulation;

import java.util.Scanner;

public class Runner01 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name: ");
        String firstName= scan.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println("enter your lastname: ");
        String lastName= scan.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println(getName(firstName,lastName));

    }

    public static String getName(String firstName, String lastName){
        return firstName+lastName+"@gmail.com";
    }



}
