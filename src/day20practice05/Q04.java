package day20practice05;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
            /*
            Ebay Interview Questions
   Get a String and a character from user
   Count the number of characters between the first occurrence and the last occurrence of the given character in the String
   Do not count the space characters
   If the character which user selected is displayed just once in the String return -1
   If the character which user selected does not exist in the String return -1
   For example; "Java is easy" - 'a' ==> 5
                "Java is easy" - 'w' ==> -1
                "Java is easy" - 'e' ==> -1
*/
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a str");
        String str= scan.nextLine();
        System.out.println("enter a chr");
        char chr= scan.next().charAt(0);
        int counter=0;
        int firstOccurence= str.indexOf(chr);
        int lastOccurence= str.lastIndexOf(chr);
        if( lastOccurence-firstOccurence!=0) {
          //  for (int i =firstOccurence+1 , i <lastOccurence, i ++){
              //  if( str.charAt(i)!=' '){
                    counter++;
                    System.out.println(counter);
                }
            }
         //   System.out.println(lastOccurence - firstOccurence);
       // } else if (lastOccurence==firstOccurence && firstOccurence>0){
          //  System.out.println("unique");
       // }else {
          //  System.out.println("not exist");
        }










