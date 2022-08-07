package SelfWorking;

import java.util.Scanner;

public class MethodBooleanReturnValue1 {
    // ask: enter an array
    // if sum of the two elements is 10, write them a1+a2=10;
    // i did this exercise without creating a method
    // BUT:
    // Now for a review : i want to create it with a boolean return type method.


    /* i cant input all the elements of the array, method working faster than main method.
    for example:
    " enter length of an array: "...... 5
    "enter a element :"....... 1
    "enter a element :"......  9
    it gives me ===>  true!!   (i cant write all the elements)
     */
    // so how can i make main method faster?
    // thanks in advance  :)
    // im really new with computer science so if it is a pointless question, ignore it. :) :)

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" enter length of an array: ");
        int length= scan.nextInt();
        int array[]=new int [length];
        for (int i=0; i<length; i++){
            System.out.println("enter an element :");
            array[i]=scan.nextInt();
        }
        System.out.println("sum of two elements =10 is  "+ is10(array));
    }
    public  static boolean is10 (int array[]){
        boolean result = false;
        for (int i=0; i<array.length; i++){
            for (int c=0; c< array.length && c!=i; c++){
                if(array[i]+array[c]==10){
                    result=true;
                }
            }

        }
        return  result;

    }



}
