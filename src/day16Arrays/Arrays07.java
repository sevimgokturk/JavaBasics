package day16Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays07 {
    public static void main(String[] args) {
        // Find the longest word in a String

        String s = "Ali Can went to school to learn";
        String array[]=s.split(" ");
        Arrays.sort(array, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length-1]);


    }
}
