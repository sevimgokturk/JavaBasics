package day10ForLoopWhileLoop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a integer:");
        int p=scan.nextInt();
        int sum=0;
        String ps=String.valueOf(p);
        for (int i=0; i<ps.length(); i++){
            char c= ps.charAt(i);
           if(ps.indexOf(c)==ps.lastIndexOf(c)){
               sum=sum+Integer.valueOf(c+" ");//
           }
        }
        System.out.println(sum);

        System.out.println("==============================");


        int sum1=0;
        for (int i1=0; i1<ps.length(); i1++){
            String c= ps.substring(i1,i1+1);
            if(ps.indexOf(c)==ps.lastIndexOf(c)){
                sum1=sum1+Integer.valueOf(c);//
            }
        }
        System.out.println(sum1);










    }
}
