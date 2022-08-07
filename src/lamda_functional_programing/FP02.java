package lamda_functional_programing;

import java.util.ArrayList;
import java.util.List;

public class FP02 {
    public static void main(String[] args) {
        //Create a method to print the list elements on the console one by one
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        printElement01(l);
        printElement02(l);
        printElement03(l);
        printElement04(l);
        printElement05(l);
    }

    public static void printElement01(List<Integer> list){
        list.stream().forEach(System.out :: print);
    }

    //Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.
    public static void printElement02(List<Integer> list){
        list.stream().forEach(t->System.out.print(t+" " ));
    }
    public static void printElement03(List<Integer> list){
        list.stream().forEach(Utils :: printInSameLineWithSpace);
    }
    //Create a method to print all elements on a separate line with a star
    public static void printElement04(List<Integer> list){
        list.stream().forEach(t->System.out.println(t+"*" ));
    }
    public static void printElement05(List<Integer> list){
        list.stream().forEach(Utils :: printElementWithStar);
    }



}
