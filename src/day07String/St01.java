package day07String;

import java.util.Scanner;

public class St01 {
    public static void main(String[] args) {

/*
pirint the first and last character on the console
java is easy....>jy on the console
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter");
        String  str=scan.nextLine();
        //
        char a=str.charAt(0);
        char b =str.charAt(str.length()-1);
        System.out.println(""+a+b);

        // substring method
        //str.substring(a,b) means a is inclusive, b is exclusive

        String a1=str.substring(0,1);
        String b1=str.substring(str.length()-1);
        System.out.println(a1+b1);

        String a2=Character.toString(str.charAt(0));
        String b2=Character.toString(str.charAt(str.length()-1));
        System.out.println(a2+b2);
        // 2.example to get i
        System.out.println("enter your name and last name");
        String name=scan.nextLine();
        int i=name.indexOf(" ")+1;
        String x=name.substring(0,1);
        String y=name.substring(i,i+1);
        System.out.println(x+y);
        //CHECK ANy character in a srting
        String sevim="sevim";
        int ii = sevim.indexOf("i");
        if(ii>=0){
            System.out.println("i is exist");
        }else {
            System.out.println( "not");
        }

        String nilbetul="nilbetul";
        boolean isContain=nilbetul.contains("m");
        if(isContain){
            System.out.println("exist");
        }else {
            System.out.println("not exist");
        }
        /*
       The methods we learned so far:
        1) equals()
        2)equalsIgnoreCase()
        3)length()
        4)toUpperCase
        5)toLowerCase
        6)contains
        7)charAt()
        8)indexOf
        9)substring(with 1 index)
        10)substring(with 2 indexes)
         */







    }

}
