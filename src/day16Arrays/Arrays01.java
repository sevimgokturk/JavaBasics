package day16Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // put each word in to array
        String words = "I go to school";
        String array[]=words.split(" ");
        System.out.println(Arrays.toString(array));

        String name = "Sevval#Mustafa#Suat#Fatmanur";
        String array1[]=name.split("#");
        System.out.println(Arrays.toString(array));

        //I go to school and I talk to friends and I talk to teachers
        //Please separate each sentence from "and" put them in an array.
        String sentence="I go to school and I talk to friends and I talk to teachers ";
        String array2[]=sentence.split("and");






    }
}
