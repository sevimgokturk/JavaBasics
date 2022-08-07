package lamda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP03 {
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
        printElements(l);
        System.out.println();
        printEvenElements(l);
        System.out.println();
        printScuerOfOdd(l);
        System.out.println();
        printOfCubeOfDistinc(l);
        System.out.println();
        printMaxElementFunctional(l);
        System.out.println();
        getMinseven(l);
        System.out.println();
        halfOfDistinctElements(l);
        System.out.println();
        printSuml(l);
        System.out.println();
        printProductl01(l);
    }
    //1)Create a method to print the list elements on the console in the same line
    public static void printElements(List<Integer> list){
        list.stream().forEach(Utils::printInSameLineWithSpace);
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.
    public static void printEvenElements(List<Integer> list){
        list.stream().filter(Utils ::checkEvenElement).forEach(Utils::printInSameLineWithSpace);
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printScuerOfOdd(List<Integer> list){
            list.stream().filter(Utils ::isOdd).map(Utils :: getSquare).forEach(Utils::printInSameLineWithSpace);
    }
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.
    public static void printOfCubeOfDistinc(List<Integer> list){
        list.stream().distinct().filter(Utils::isOdd).map(Utils::getCube).forEach(Utils::printInSameLineWithSpace);
    }
    //5)Create a method to find the maximum value from the list elements
    public static void printMaxElementFunctional(List<Integer> list) {
        Integer maxElement = list.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(maxElement);
    }
    //7)Create a method to find the minimum value which is greater than 7 and even from the list
    //more than 7, even, min value
    public static void getMinseven(List<Integer> list){

        list.stream().distinct().filter(t-> t>7).filter(Utils::checkEvenElement).reduce(Integer.MAX_VALUE , Math::min);
    }
    //8)Create a method to find the half of the elements which are distinct
    // and greater than 5 in reverse order in the list.
    public static void halfOfDistinctElements(List<Integer> list) {
        List<Double> newList = list.stream().distinct().filter(t -> t > 5).map(Utils::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(newList);
    }
    //9)Create a method to calculate the sum of the squares of distinct even elements
    public static void printSuml(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(Utils::checkEvenElement).map(Utils::getSquare).reduce(0, Math::addExact);//it gives last element

        System.out.println(sum);
    }

    //10)Create a method to calculate the product of the cubes of distinct even elements

    public static void printProductl01(List<Integer> list) {
        Integer product = list.stream().distinct().filter(Utils::checkEvenElement).map(Utils::getCube).reduce(1, Math::multiplyExact);//it gives last element

        System.out.println(product);
    }

}
