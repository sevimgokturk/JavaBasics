package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
              /*
        A list has elements "M", "K" and "P"
        Ask user to enter a letter
        If the letter exists in list convert it to "Got it"
        otherwise list will stay same

*/
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter");
        String str=scan.next();
        List <String> list=new ArrayList<>();
        list.add("M");
        list.add("K");
        list.add("p");
        if(list.contains(str)){
            list.set(list.indexOf(str),"got it!");
        }else {
            list.add(str);
        }




    }
}
