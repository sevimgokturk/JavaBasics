package day05IfElseStatement;

import java.util.Scanner;

public class AndOrOpperations {
    public static void main(String[] args) {
  /*
                || means "or": If you use "||" between 2 things it means at least 1 of them is enough for you
                       For example; "tea || coffee" means just tea, or just coffee, or both
                       To get false from || operation all must be false
                       true || true ==> true
                       true || false ==> true
                       false || true ==> true
                       false || false ==> false
                     Note: "|" checks both conditions.
                           "||" does not check the second condition, if first one is true
                           "||" is faster than "|"
       && means "and":  If you use "&&" between 2 things it means you want both.
                        For example; "tea && coffee" means I want both, just one of them will not be enough
                        To get true from && operation all must be true.
                        true && true ==> true
                        true && false ==> false
                        false && true ==> false
                        false && false ==> false
        & means "and":  If you use "&" between 2 things it means you want both.
                        For example; "tea & coffee" means I want both, just one of them will not be enough
                        To get true from && operation all must be true.
                        true & true ==> true
                        true & false ==> false
                        false & true ==> false
                        false & false ==> false
        Note: "&" and "&&" do the same but
              "&&" does not check the second condition if the first condition is false.
              "&" checks both conditions every time.
         */
        System.out.println(5 > 4 || 5 < 4);
        System.out.println(5 > 4 && 5 < 4);
        System.out.println(5 < 4 || 7 == 3 + 4);

        System.out.println("do you have cart or cash..");
        Scanner scan = new Scanner(System.in);
        System.out.println("Write 'yes' or 'no¨...");
        boolean cash = false;
        if (scan.equals("yes")) {
        }cash = true;
        boolean creditCart = true;
        if (cash || creditCart) {
            System.out.println("i can buy a pc");
        } else {
            System.out.println("i cant bu a pc");
        }


    }
}
