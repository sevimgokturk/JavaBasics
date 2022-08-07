package day18ArrayList;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
                /*
        Ask user to enter a letter
        If the letter exists in the list convert it to "Got it"
        otherwise, add the element user entered into the list
        */
        Scanner scan=  new Scanner(System.in);
        System.out.println(" enter a letter: ");
        String letter= scan.next().toUpperCase(Locale.ROOT);
        ArrayList<String> list = new ArrayList<>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        for (int i=0; i<list.size(); i++){
            if (list.contains(letter)){
                list.set(list.indexOf(letter),"Got it" );
            }else {
                list.add(letter);

            }
            break;
        }
        System.out.println(list);






    }
}
