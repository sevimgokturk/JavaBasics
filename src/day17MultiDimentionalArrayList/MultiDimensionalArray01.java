package day17MultiDimentionalArrayList;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
//if we use arrays as elements in an array then it is called multidimensional array.
// how to create multidimensional array
        int mda1[][]=new int[3][2];
//how to print multidimensional array on the console
        System.out.println(Arrays.deepToString(mda1));
        // how to assign values
        mda1[0][0]=11;
        mda1[0][1]=9;
        mda1[1][0]=5;
        mda1[1][1]=4;
        mda1[2][0]=1;
        mda1[2][1]=21;
        System.out.println(Arrays.deepToString(mda1));
        //how to create multidimensional array
        int mda2[][]={{2,3},{12},{21,34,56},{4}};
        System.out.println(Arrays.deepToString(mda2));
        //how to print a spesific inner element
        System.out.println(Arrays.toString(mda2[2]));

        //how to find the number of elements
       int  counter=0;
        for (int[] w: mda2){
            for (int c : w){
                counter++;

            }
        }
        System.out.println(counter);

        System.out.println("============================");

        int sum=0;
        for (int []w:mda2){
            sum=sum+w.length;
        }
        System.out.println(sum);









    }
}
