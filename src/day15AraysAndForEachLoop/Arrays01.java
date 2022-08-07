package day15AraysAndForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {
        //Sort the elements according to their length
        // "Ali" "veli" "maria" "michael"

        String arr[]={"Veli","Michael","Ali","Maria"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        // sort the elements according to their length in accenting order
        String arr1[]={"Veli","Michael","Ali","Maria"};
        Arrays.sort(arr1,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(arr1));

        //sort the elements according to their length in accenting order
        // if some elements has same length put them alphabetic order
        String arr2[]={"Veli","Nil","Michael","Ayse","Ali","Maria"};
        Arrays.sort(arr2,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr2));
        //









    }

}
