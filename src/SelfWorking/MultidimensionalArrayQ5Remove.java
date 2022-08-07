package SelfWorking;

import java.util.ArrayList;
import java.util.Arrays;

public class MultidimensionalArrayQ5Remove {
    public static void main(String[] args) {
        /*
        Write a Java program to remove a specific element from an array.
         */
        int arr1[][]={ {1,2,3}, {4,5}, {6,7} };
        int index1 =1;
        int index2=0;
        removeSpecificElement(arr1,index1,index2);
    }

    public static void removeSpecificElement (int[][] array1, int index1, int index2){
        ArrayList<Integer> list = new ArrayList<>();
        int size=array1.length;
        for (int i=0; i<size; i++){
            for (int c=0; c<array1[i].length; c++){
                if (array1[i][c]!=array1[index1][index2]){
                    list.add(array1[i][c]);

                }
            }
        }

        System.out.println(list);

}
}
