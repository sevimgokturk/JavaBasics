package day17MultiDimentionalArrayList;

import java.util.Arrays;

public class MultidimensionArray02 {
    public static void main(String[] args) {
       // String arr1[][] = { {“learn”, “java”, “it”}, {“is”, “easy”} };
//Print the elements which have “a” from a 2 dimensional String array
        String arr2[][]={{ "learn","java","it"},{"is","easy"}};

        for (String[] w: arr2){
            for (String c : w){
               if(c.contains("a")) {
                   System.out.println(c);
               }
            }
        }

        int sum=0;
        for (String[] w: arr2) {
          sum=sum+w.length;

        }
        int idx=0;
        String newArray[]=new String[sum];
        for (String[] w: arr2) {
            for (String c: w) {
              newArray[idx]=c;
              idx++;
            }

        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("===============");










    }
}
