package day24ObjectManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner02 {
                /*
        Ask user their name and lastname
        Then generate an email for them
        concatenate  firstname and lastname
        and "@gmail.com" then print email for the user on the console
 */

    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        List<String> lastname=new ArrayList<>();
        List<String> emailsList=new ArrayList<>();
            for (int i=0; i<2; i++){
                Scanner scan =new Scanner(System.in);
                System.out.println("enter your name: ");
                name.add( scan.nextLine().replaceAll(" ", "").toLowerCase());
                System.out.println("enter your lastname: ");
                lastname.add(scan.nextLine().replaceAll(" ", "").toLowerCase());
                emailsList.add(name.get(i)+lastname.get(i)+"@gmail.com");
            }
            System.out.println(emailsList);

        System.out.println("=============================================");

        List<String> name1=new ArrayList<>();
        List<String> lastname1=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two name: ");
        name1.add(scan.next());
        name1.add(scan.next());
        System.out.println("enter two last name");
        lastname1.add(scan.next());
        lastname1.add(scan.next());
        System.out.println(getEmail(name1,lastname1));

        }

        public static List<String> getEmail(List<String> firstName,List<String> lastName){
            List<String> emailsList1=new ArrayList<>();
            for (int i=0; i<firstName.size(); i++){
               emailsList1.add((firstName.get(i)+lastName.get(i)+"@gmail.com").replaceAll(" ","").toLowerCase());
            }
            return emailsList1;
        }
}
