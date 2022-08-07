package SelfWorking;

import java.util.Arrays;

public class MultidimesionalArrayQ4 {
    public static void main(String[] args) {
        /*
        4) Find the sum of the elements
        in the array elements of the given multi dimensional array
        { {1,2,3}, {4,5}, {6,7} } and return an array.
        For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

         */
        int arr[][]={ {1,2,}, {4,5,6,3}, {6,7,7} };
        newSumArray(arr);

    }
    public static void newSumArray(int array[][]){
        int arrNew[]=new int[array.length];
        for (int j=0; j<array.length;j++){
            for (int i=0; i<array[j].length; i++){
               arrNew[j]=arrNew[j]+array[j][i] ;
            }
        }

        System.out.println(Arrays.toString(arrNew));
    }



}
