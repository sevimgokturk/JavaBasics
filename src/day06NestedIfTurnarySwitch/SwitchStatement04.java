package day06NestedIfTurnarySwitch;

import java.util.Locale;
import java.util.Scanner;

public class SwitchStatement04 {
    public static void main(String[] args) {

/*
Ask user to enter country name among “America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France”
	 	Type code to print abbreviation of the countries. “US, UK, DE, TR, IN, PE, ES, BG, AL, FR”
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter country...");
        String country=scan.next().toLowerCase(Locale.ROOT);

        switch (country){
            case "america":
                System.out.println("US");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            default:
                System.out.println("invalid");
        }
        // if you want to switch work with case insensitive use to lower case and make cases in switch lover cases

    }
}
