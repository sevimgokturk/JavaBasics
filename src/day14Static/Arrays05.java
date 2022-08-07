package day14Static;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        //How to create an array and put elements in it in one line

        int a[]={12, 7, 0,-32};
        System.out.println(Arrays.toString(a));

        int b[]={12, 7, 0,32};
        System.out.println(Arrays.toString(b));

        //Ho wto check if two arrays are same or not
        //Note: If two arrays have same elements at the same indexes then array are same.
       boolean areArraysSame= Arrays.equals(a,b);
        System.out.println(areArraysSame);

        System.out.println("===================");

        //are there any common element
        for (int i=0; i<a.length; i++){
            for (int c=0; c< b.length; c++){
                if(a[i]==b[c]){
                    System.out.println(a[i]+" is a common element");
                }
            }
        }
        System.out.println("=============================");

        //Type code to check if 2 arrays have same elements

        Arrays.sort(a);//[0, 7, 12, 32]
        Arrays.sort(b);//[0, 7, 12, 32]
        if(Arrays.equals(a, b)){
            System.out.println("Same arrays");
        }else{
            System.out.println("Different arrays");
        }

        System.out.println("==================================");

        int m =30;
        int k = 12;
        for (int i=0; i<a.length; i++){
            if(a[i]==m){
                System.out.println("exist");
                break;
            }else {
                System.out.println("not exist");
                break;
            }
        }
        System.out.println("===================================");
        for (int w : a){
            if(w==m){
                System.out.println("exist");
                break;
            }else {
                System.out.println(" not exist");
                break;
            }
        }
        System.out.println("=======================================");
        // flag is used to test if a part worked or not
        int counter=0;
        for (int w : a){
            if (w==m){
                counter++;
                break;
            }
        }
        if( counter==0){
            System.out.println(" not exist");

        }else {
            System.out.println("exist");

        }
        System.out.println("===============================");








    }

}
