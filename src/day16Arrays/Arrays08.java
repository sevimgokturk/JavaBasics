package day16Arrays;

import java.util.Arrays;

public class Arrays08 {
    public static void main(String[] args) {
        //Type code to find if a given element exists in the given array
        //Print the console if exists or not
        int array [] = {34,52,12,37,29};
        int expectedElement = 18;
        int isExist=Arrays.binarySearch(array,expectedElement);
        if(isExist<0){
            System.out.println("not");
        }else {
            System.out.println("exist");
        }
        //2.Way:==================
        boolean isExist1=false;
        for (int w: array){
            if(w==expectedElement){
                isExist1=true;
            }
        }
        if (isExist1){
            System.out.println("exist");
        }else {
            System.out.println("not");
        }






    }
}