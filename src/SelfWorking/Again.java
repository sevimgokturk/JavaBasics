package SelfWorking;

import java.util.Arrays;

public class Again {
    public static void main(String[] args) {
         /*
        Write a Java program to remove a specific element from an array.
         */
        int arr1[][]={ {1,2,3}, {4,5}, {6,7} };

        int index1 =1;
        int index2=0;
        int size=arr1.length;
        int counter1=0;
        int counter2=0;
        for (int i=0; i< arr1.length; i++){
            if( i!=index1){
                counter1++;
            }
                for (int j=0; j<arr1[i].length; j++){
                    if(i!=index2){
                        counter2++;
                    }
                }
        }
        int arr2[][] = new int[counter1] [counter2];

            System.out.println(Arrays.deepToString(arr2));



    }
}
