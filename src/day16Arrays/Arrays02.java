package day16Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Please split this one into its letters
        //[F,a,t,m,a,S,e,h,e,r]
        String name="FatmaSeher";
        String nameArray[]=name.split("");
        System.out.println(Arrays.toString(nameArray));
        char array[]=name.toCharArray();
        System.out.println(Arrays.toString(array));





    }
}
