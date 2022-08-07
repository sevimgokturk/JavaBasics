package day10ForLoopWhileLoop;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        for (int i=1;i<6;i++){
            for (int k=1; k<=i ;k++){
                System.out.print(k);
            }

            System.out.println();
        }


        System.out.println("=======================================");
        int rows=3;
        int colons=4;
        for (int i=1; i<rows+1; i++){
            for (int k=1; k<colons+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("===================================");

        for (int i=1; i<5; i++){
            for(int k=1; k<4; k++){
                System.out.println("day"+k);
            }
            System.out.println("week"+i);
        }


        System.out.println("=======================================");

        for (int i=1; i<5; i++){
            for(int k=1; k<4; k++){
                System.out.println("Hello"+i);
            }
            System.out.println();
        }

        System.out.println("==========================================");

        //5)Type code to check if a given String is Palindrome.
        //  String: anna  Reversed String: anna

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a String or integer:......");
        String str=scan.next();
        String rStr="";
        for(int i=str.length()-1; i>-1; i--){
            rStr = rStr+str.charAt(i);
        }
        System.out.println(rStr);
        if(str.equals(rStr)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

        System.out.println("===================================");

        //palindrome for integer

        int integer=12345;
        String str1= String.valueOf(integer);
        String rStr1="";
        for(int i=str1.length()-1; i>-1; i-- ){
            rStr1=rStr1+str1.charAt(i);
        }
        System.out.println(rStr1);
        if(rStr1.equals(str1)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

        System.out.println("=========================================");

        // sum of digits
        int num= 234;
        int sum=0;
        for (int i=num; i>0; i=i/10){
         sum=sum+i%10;
        }
        System.out.println(sum);

        System.out.println("==========================================");

        // sum of digits
        // hi; i dont understand why the code cant catch the first digits
        //it gives me : 3+4,  but i need : 2+3+4

        int n= 234;
        int sum1=0;
        for (int i=1 ;i<n+1; i =i*10){
            n=n/i;
            sum1=sum1+n%10;
        }
        System.out.println(sum1);

        System.out.println("==========================================");
        //6.Example: Type code to find the sum of the unique digits of an integer.
        int n2=123344;
        String n2Str=String.valueOf(n2);
        int sum2=0;
        for (int i=0; i<n2Str.length(); i++){
            String c= n2Str.substring(i,i+1);
            if(n2Str.lastIndexOf(c)==n2Str.indexOf(c)){
               sum2=sum2+Integer.valueOf(c);
            }
        }
        System.out.println(sum2);

        System.out.println("=============================================");
        //2.Example: Type code to print odd integers
        // from 12 to 67 in the same line with a space between them
        int i=12;
        while (i<68){
            if(i%0!=0) {
                System.out.print(i+" ");

            }
            i++;
        }











    }
}
























