package day10ForLoopWhileLoop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        //Type code to find the sum of the integers from 12 to 231
        int sum=0;
        for(int i=12; i<232; i++){
            sum= sum+i;
        }
        System.out.println(sum);

// if you put sout inside the loop you will see the sum value for every loop
//Note:If you put System.out.println(sum); inside the loop you will see the sum value for every loop.
//     If you expect to see the sum value for every loop put it inside the loop,
//     if you want to see the final sum value put it outside

        int m=1;
        for(int i1=3; i1<6; i1++){
            m= m*i1;
        }
        System.out.println(m);
        //5)Type code to check if a given String is Palindrome.
        //  String: anna  Reversed String: anna
        //  Intgeger: 12321  Reversed Integer: 12321


        String s="1234";
                String rev="";

        for (int i3=s.length()-1;i3>1; i3++){
            rev=rev+s.charAt(i3);
        }
        if(s.equals(rev)){
            System.out.println("pal");
        }else {
            System.out.println("not pal");
        }

        int num=12321;
        String str1=String.valueOf(num);
        String rev1="";

        for (int i4=str1.length()-1 ;i4>1;  i4++){
            rev1 = rev1+str1.charAt(1);
        }
        if(str1.equals(rev1)){
            System.out.println("pal");
        }else {
            System.out.println("not pal");
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=scan.next().toLowerCase();
        int length1= str.length();
        int length=length1-1;
        int n=0;
        char first= str.charAt(n);
        char last=str.charAt(length);
        if (last==first){

            if (first==last){
                n++;
                length--;
                System.out.println("palindrome");

            }

        }else {
            System.out.println("not palindrome");
        }












    }
}
