package day17MultiDimentionalArrayList;

import java.util.Arrays;

public class Review03 {
    /*
    int length = ar.length;
        int max = ar[0];
        int min = ar[0];
        for (int i=0 ; i <length; i++){
            max= (ar[i]>max ?  ar[i] : max);
            min= (ar[i]<min ? ar[i] : min);

        }
        System.out.println("max = "+ max);
        System.out.println("min = " + min);
     */
    public static void main(String[] args) {
        int arr2[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };
        int sum=0;
        for (int[] w: arr2) {
            sum=sum+w.length;

        }
        int idx=0;
      int newArray[]= new int[sum];
        for (int[] w: arr2) {
            for (int c: w) {
                newArray[idx]=c;
                idx++;
            }

        }
        int length = newArray.length;
        int max = newArray[0];
        int min = newArray[0];
        for (int i=0 ; i <length; i++){
            max= (newArray[i]>max ?  newArray[i] : max);
            min= (newArray[i]<min ? newArray[i] : min);

        }
        System.out.println("max = "+ max);
        System.out.println("min = " + min);





    }
}
