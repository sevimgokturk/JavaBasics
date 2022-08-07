package SelfWorking;

import java.util.Arrays;

public class Arrays05OddEvens {
    public static void main(String[] args) {
        int [] ar = {0, 3, 4, 7, 5, 12, 15};
        int length= ar.length;
        int[] ar2= new int[length];

        int i=0;
        int c=0;
       for (int w : ar){
           if(w%2==0){
               ar2[i]=w;
               i++;
           }else {
               ar2[length-1-c]=w;
               c++;
           }
       }

        System.out.println(Arrays.toString(ar2));







    }
}
