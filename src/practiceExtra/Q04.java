package practiceExtra;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        /*
         * write a method that accepts an array and prints true
         * if the sum of all 3's in the array is exactly 9
         *
         * Input : {2,3,5,3,6,3,7} output :true
         * Input : {2,3,4,5,6,3,7} output :false
         */
        int array1[]= {2,3,5,3,6,3,7};
        isNine(array1);

        int array2[]={2,3,4,5,6,3,7};
        isNine(array2);

        //====================



    }
    // create a methods
    public static void isNine(int array[] ){
        int sum =0;
        for (int w : array){
            if(w==3){
                sum+=w;
            }

        }
        if(sum==9){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }


}
