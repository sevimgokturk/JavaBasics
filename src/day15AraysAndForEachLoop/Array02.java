package day15AraysAndForEachLoop;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        String arr[]={"Ayhan","Ceyhan","Beyhan"};
        String prr[]=arr.clone();
        Arrays.sort(prr);
        if ((Arrays.equals(arr,prr))){
            System.out.println("Natural");
        }else {
            System.out.println("not natural");
        }
        System.out.println("======================================");

        String arr1[]={"Ayhan","Ceyhan","Beyhan"};
        String prr1[]=Arrays.copyOf(arr1 ,3);
        Arrays.sort(prr1);
        if ((Arrays.equals(arr1,prr1))){
            System.out.println("Natural");
        }else {
            System.out.println("not natural");
        }
        System.out.println("======================================");

    }
}
