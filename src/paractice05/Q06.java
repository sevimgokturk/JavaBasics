package paractice05;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input="";
        int counter=0;
        do {
            counter++;
            System.out.println("enter");
           input=scan.next()+input;

        }while (counter<6);

        //System.out.println(addStr(input));


    }
    public  static void addStr(String... input){
        String strJoin="";
        for (String w: input){
            strJoin=strJoin+w+" ";
        }
        System.out.println(strJoin);

    }
}
