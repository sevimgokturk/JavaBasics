package lamda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FP01 {
    public static void main(String[] args) {
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
        //1)Create a method to print the list elements on the console in the same line
        // with a space between consecutive elements(Structured)
        printElementStructured(l);
        System.out.println();
        printElementFunctional(l);
        System.out.println();
        printElementEvensStructured(l);
        System.out.println();
        printElementEvenFunctional(l);
        System.out.println();
        printElementSquareOddFunctional(l);
        System.out.println();
        printDistinctOddElementOfCube(l);
        System.out.println();
        printMaxElementFunctional(l);
        System.out.println();
        printMinElementFunctional02(l);
        System.out.println();
        printMaxElementFunctional02(l);
        getMinEvenGraterThanSeven1(l);
        getMinEvenGraterThanSeven2(l);
        getMinEvenGraterThanSeven3(l);
        System.out.println();
        getHalfOfUniqueElementGraterThanFive(l);
        printSuml01(l);
      printProductl01(l);


    }

    public static void printElementStructured(List<Integer> list) {

        for (Integer w : list) {
            System.out.print(w + " ");
        }

    }

    //1)Create a method to print the list elements on the console in the same line
    // with a space between consecutive elements(Functional)
    public static void printElementFunctional(List<Integer> list) {
        list.stream().sorted().forEach(t -> System.out.print(t + " "));

    }

    //2)Create a method to print the even list elements on the console in the same line with a space
//  between two consecutive elements.(Structured)

    public static void printElementEvensStructured(List<Integer> list) {

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }


    //2)Create a method to print the even list elements on the console in the same line with a space
//  between two consecutive elements.(Functional)
    public static void printElementEvenFunctional(List<Integer> list) {
        list.stream().sorted().filter(t-> t%2==0).forEach(t -> System.out.print(t + " "));

    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
//  space between two consecutive elements.(Functional)

    public static void printElementSquareOddFunctional(List<Integer> list) {
        list.stream().sorted().filter(t-> t%2!=0).map(t->t*t).forEach(t -> System.out.print(t + " "));

    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.

    public static void printDistinctOddElementOfCube(List<Integer> list){
        list.stream().distinct().filter(t->2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //5)Create a method to find the maximum value from the list elements

    public static void printMaxElementFunctional(List<Integer> list) {
       Integer maxElement= list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t :u);
        System.out.println(maxElement);

    }
    //2.way
    public static void printMaxElementFunctional02(List<Integer> list) {
        Integer maxElement= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);//it gives last element

        System.out.println(maxElement);


    }
    //6)Homework: Create a method to find the minimum value from the list elements(In 2 ways)
    public static void printMinElementFunctional02(List<Integer> list) {
        Integer minElement= list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t :u);
        System.out.println(minElement);

    }
    //2.way
    public static void printMinElementFunctional01(List<Integer> list) {
        Integer mixElement = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t, u) -> u);//it gives last element

        System.out.println(mixElement);
    }
    //7)Create a method to find the minimum value which is greater than 7 and even from the list
        //more than 7, even, min value
        //1.Way
    public static void getMinEvenGraterThanSeven1(List<Integer> list){
        Integer m=list.stream().distinct().sorted(Comparator.reverseOrder()).filter(t-> t>7).filter(t-> t%2==0).reduce(Integer.MAX_VALUE,(t, u)->u);
        System.out.println(m);
    }
    //2.Way
    public static void getMinEvenGraterThanSeven2(List<Integer> list){
        Integer m=list.stream().distinct().filter(t-> t>7).filter(t-> t%2==0).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t :u);
        System.out.println(m);
    }
    //3.Way
    public static void getMinEvenGraterThanSeven3(List<Integer> list){
        Integer m=list.stream().distinct().sorted().filter(t-> t>7).findFirst().get();

        System.out.println(m);
    }

    //8)Create a method to find the half of the elements which are distinct
    // and greater than 5 in reverse order in the list.

    public static void getHalfOfUniqueElementGraterThanFive(List<Integer> list){
       List<Double>  m= list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(m);

    }
    //9)Create a method to calculate the sum of the squares of distinct even elements

    public static void printSuml01(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t, u) -> u+t);//it gives last element

        System.out.println(sum);
    }
    //10)Create a method to calculate the product of the cubes of distinct even elements

    public static void printProductl01(List<Integer> list) {
        Integer product = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1, (t, u) -> u*t);//it gives last element

        System.out.println(product);
    }






}
