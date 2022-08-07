package day24ObjectManipulation;

import java.util.Scanner;

public class Runner33 {
    /*
    Ask user their name and lastname
    Then generate an email for them
    concatenate  firstname and lastname
    and "@gmail.com" then print email for the user on the console
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name and lastname: ");
        Person person1= new Person(scan.nextLine(), scan.nextLine());
        System.out.println(person1.name+person1.lastname);
        System.out.println(email(person1));
    }
    public static String email(Person person){
        String emaill=(person.name+ person.lastname+"@gmail").replaceAll(" ", "").toLowerCase();
        return emaill;

    }

}
