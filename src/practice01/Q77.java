package practice01;

import java.util.Locale;
import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        /*
    Type the codes which asks the user to put the letters for the favorite football club in Turkey.
    It prints "Galatasaray" for gs,
    it prints "Trabzonspor" for ts,
    it prints "Besiktas" for bjk, and
    it prints "Fenerbahce" for fb.
    Please use switch statement in your codes.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your team   : ");
       String team = scan.nextLine().toLowerCase(Locale.ROOT);
       switch (team){
           case "galatasaray":
               System.out.println("GS");
               break;
           case "trabzon":
               System.out.println("TS");
               break;
           case "besiktas":
               System.out.println("BJK");
               break;
           case "fenerbahce":
               System.out.println("FB");
               break;
           default:
               System.out.println("enter correctly");
       }












    }

}
