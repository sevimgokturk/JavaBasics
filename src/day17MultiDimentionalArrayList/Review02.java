package day17MultiDimentionalArrayList;

import java.util.Arrays;

public class Review02 {
    public static void main(String[] args) {
        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };
        int sum=0;

        for (int w[] :a ){
            sum=sum+w.length;
        }

        int[] a2 = new int[sum];
        int idx=0;

        for (int w[]: a){
            for (int c: w){
                a2[idx]=c;
                idx++;
            }
        }
        Arrays.sort(a2);

        System.out.println("max = "+a2[sum-1]);
        System.out.println("min = "+a2[0]);


    }
}
