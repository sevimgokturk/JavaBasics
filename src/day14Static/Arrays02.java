package day14Static;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String myStringArrays[]=new String[4];
        System.out.println(Arrays.toString(myStringArrays));// [ null, null, null, null ]

        //Add elements into the array
        myStringArrays[0]="Veli";
        myStringArrays[1]="Can";
        myStringArrays[2]="Beyhan";
        myStringArrays[3]="Ali";

        //How to put the elements in alphabetical order
        Arrays.sort(myStringArrays);
        System.out.println(Arrays.toString(myStringArrays));// [Veli, Can, Beyhan, Ali]

        //How to print the elements in different lines
        for(String w :myStringArrays){
            System.out.println(w);
        }


        System.out.println("===========================");


        //Print the list elements
        // if the number of characters is less than 4.
        // [Ali, Beyhan, Can, Veli]

        for(String w :myStringArrays){
            if(w.length()<4)
            System.out.println(w);
        }
        System.out.println("=======================");

        //Print the list elements before "Can"
        for(String w :myStringArrays){

            if(w.equals("Can")){
                break;
            }
            System.out.println(w);

        }

        System.out.println("========================");

        //Print the list elements except "Can"
        // if there is. [Ali, Beyhan, Can, Veli]
        //1.Way:
         for ( String w :myStringArrays){
             if(!w.equals("Can")){
                 System.out.println(w);
             }
         }

        System.out.println("=========================");

        //2.Way:
         for (String w : myStringArrays){
             if(w.equals("ban")){
                 continue;// Skips element/s under some conditions
             }
             System.out.println(w);
         }
        System.out.println("==========================");














    }
}
