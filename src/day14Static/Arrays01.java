package day14Static;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Java created Arrays structure to be able to store multiple data in it.
        //You can store multiple data in an array, they should be in the same data type
        //To create an array, you must inform Java about the number of data you want to store in the array


        int myArray [] = new  int[5] ;
        //How to print an array on the console
        System.out.println(Arrays.toString(myArray));//[0, 0, 0, 0, 0]


        //How to assign a value to a specific array element
        myArray[1]=11;
        System.out.println(Arrays.toString(myArray));//[0, 11, 0, 0, 0]
        myArray[3]=21;
        System.out.println(Arrays.toString(myArray));//[0, 11, 0, 21, 0]
        myArray[4]=1;
        System.out.println(Arrays.toString(myArray));
        myArray[0]=41;
        myArray[2]=31;
        System.out.println(Arrays.toString(myArray));

        //How to print a specific element on the console
        System.out.println(myArray[2]);

        //How to get the number of elements in an array
        //Note: We were using "length()" in String Class, we will use "length" in Arrays Class
        System.out.println(myArray.length);

        //Print the sum of the first and the last element in an array on the console
        int firstElement= myArray[0];
        int lastElement=myArray[myArray.length-1];
        System.out.println(firstElement+lastElement);

        System.out.println(myArray[0]+myArray[myArray.length-1]);

        System.out.println("=====================================");

        //Find the sum off all elements in an array. [41, 11, 31, 21, 1]
        //Way: Use do-while-loop
        int sum =0;
        int m=0;
        do{
           sum = sum +myArray[m] ;
           m++;
        }while (m<myArray.length);
        System.out.println(sum);

        System.out.println("=======================");

        //2.Way: Use for loop
        int sum1 =0;
        for (int i=0 ; i<myArray.length; i++){
            sum1 = sum1 +myArray[i];
        }
        System.out.println(sum1);

        System.out.println("==============================");

        //Way: Use for-each-loop. for-each-loop can be used with collections and array
        int sum2 = 0;
        for(int w: myArray){
            sum2 =sum2 +w;
        }
        System.out.println(sum2);

        System.out.println("=====================");

        //2.Way while loop

        int sum3=0;
        int y=0;
        while (y<myArray.length){
            sum3 =sum3+ myArray[y];
            y++;
        }
        System.out.println(sum3);








    }
}
