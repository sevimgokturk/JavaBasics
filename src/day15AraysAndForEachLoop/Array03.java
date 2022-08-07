package day15AraysAndForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Array03 {
    public static void main(String[] args) {
        // how to check if its exsist
        int[] arr={ 32, 14, 2, 11};
        for (int w: arr){
            if(w==2){
                System.out.println(w+" exist");
                break;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,32));//index
        System.out.println(Arrays.binarySearch(arr,36));//order
        //NOT: binary returns the index of existing element
       // for non exiting  give the order
        // for binary should use sort
        // do not use binary for repeating elements








    }
}
