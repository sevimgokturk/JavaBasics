package practice08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q011 {
    public static void main(String[] args) {
        Scanner scan=  new Scanner(System.in);
        System.out.println("Enter");

        ArrayList<String> list = new ArrayList<>();
        String str = "";
        while (!str.equals("*")) {
            str = scan.next();
            if (!str.equals("*")) {

                list.add(str);
            }

        }
        System.out.println(list);
        Set<String> listSet = new HashSet<String>(list);
        System.out.println(listSet);
    }
}
