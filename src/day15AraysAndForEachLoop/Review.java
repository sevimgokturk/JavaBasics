package day15AraysAndForEachLoop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Review {
    public static void main(String[] args) {
        String arr[]={"sevim","osman","nil","idil","yagmur"};
        System.out.println(Arrays.toString(arr));

        System.out.println(" ==========sort ============");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("===========binary ali =============");

        System.out.println(Arrays.binarySearch(arr,"ali"));

        System.out.println(" ==========binary sevim ================");

        System.out.println(Arrays.binarySearch(arr,"sevim"));

        System.out.println("========natural order ==============");

        String arrCopy [] = Arrays.copyOf(arr,arr.length);
        if(arr.equals(arrCopy)){
            System.out.println("naturel order");
        }else {
            System.out.println("not naturel order");

        }
        System.out.println(" ========Comparator.compering(String::length)=================");

        Arrays.sort(arr, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(arr));

        System.out.println(" ======Comparator.comparing(String::length).reversed())=========");

        Arrays.sort(arr, Comparator.comparing(String::length).reversed());
        System.out.println(Arrays.toString(arr));

        System.out.println("====Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder())========");

      String arr2[]={"nnn","aaa","7777","c","ks","a","ak0",""," "};
      Arrays.sort(arr2,Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr2));









    }
}
