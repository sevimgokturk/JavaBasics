package day06NestedIfTurnarySwitch;

import java.util.Scanner;

public class SwitchStatement03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number...");
        double firstNumber = scan.nextDouble();
        System.out.println("Enter second number...");
        double secondNumber = scan.nextDouble();

        System.out.println("Select operation: -, +, *; /, %");
        // to get a single caracter from user we type that code.
        char operation =scan.next().charAt(0);
        switch (operation){
            case '-':
                System.out.println(firstNumber-secondNumber);
                break;
            case '+' :
                System.out.println(firstNumber+secondNumber);
                break;
            case '/':
                System.out.println(firstNumber/secondNumber);
                break;
            case '*' :
                System.out.println(firstNumber*secondNumber);
                break;
            case '%' :
                System.out.println(firstNumber*secondNumber/100);
                break;
            default:
                System.out.println("invalid");



        }


// in switch you can used following
        // int byte short  char String
        // can not used: long fload double boolean






    }
}
