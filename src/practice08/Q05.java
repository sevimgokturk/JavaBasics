package practice08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q05 {
    public static void main(String[] args) {
          /*
	 	Ebay Interview Question
	 	Create an array and get elements of array from user
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */
        Scanner scan =new Scanner(System.in);
        System.out.println("enter length of array: ");
        int length= scan.nextInt();

        int [] array =new int[length];

          for (int i=0;i<length;i++){
              System.out.println("enter an element: ");
              array[i]=scan.nextInt();
          }
        System.out.println(Arrays.toString(array));

          int [] arr=new int[length];
          int idx=0;
          for (int i=0;i<length;i++){
              if(array[i]!=0){
                  arr[idx]=array[i];
                  idx++;
              }
          }


        System.out.println(Arrays.toString(arr));









    }
}
