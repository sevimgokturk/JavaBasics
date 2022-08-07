package practice04;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        /*
         * Create a method that can add the even numbers in the array
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         * OUTPUT : The sum of even numbers is  : 30
         */
        int [][] ar1 = {{1,3,6},{2,8},{5,7,9,14}};
     sumOf(ar1);
    }
    public static void sumOf(int ar1[][]){

        int sum=0;
        for (int w[]: ar1){
            for (int c: w){
                if(c%2==0){
                    sum=sum+c;
                }
            }
        }
        System.out.println(sum);

    }

}
