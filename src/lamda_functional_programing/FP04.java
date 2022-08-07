package lamda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class FP04 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
    printElementUppercase(l);
        System.out.println();
   // printElementUppercase02(l);
        System.out.println();
        System.out.println(l);
        printElementOrderingToLength(l);
        System.out.println();
        printElementOrderingToLength1(l);
        System.out.println();
        printDistinctElementOrderingToLength1(l);
        System.out.println();
        printElementOrderingToLengthThanFirstChar2(l);
        System.out.println();
       // removeTheElementGraterThanFife(l);
        System.out.println();
       // remove8and10AndEndingO(l);
        System.out.println();
        System.out.println(checkElementOfLengthLessThan12(l));;
        System.out.println(checkNotStartX(l));
        System.out.println(checkNotStartX02(l));
        System.out.println(checkListMatchR(l));
    }
    //1) Create a method to print all list elements in uppercase in the same line with a space
    public static void printElementUppercase( List<String> list){
        list.stream().map(t-> t.toUpperCase(Locale.ROOT)).forEach(Utils ::printInSameLineWithSpace);
    }

    //2.Create a method to print all list elements in uppercase in the same line with a space
    //public static void printElementUppercase02( List<String> list){
    //    list.replaceAll(String::toUpperCase);//mutable
     //   System.out.println(list);
  //  }
    //Create a method to print the elements after ordering according to their lengths

    public static void printElementOrderingToLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithSpace);
    }
    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printElementOrderingToLength1(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithSpace);
    }
    //4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctElementOrderingToLength1(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils ::getLastChar)).forEach(Utils::printInSameLineWithSpace);
    }
    //5) Create a method to sort the elements according to their lengths then according to their first character
    public static void printElementOrderingToLengthThanFirstChar2(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar)).forEach(Utils::printInSameLineWithSpace);
    }
    //6) Remove the elements if the length of the element is greater than 5
    //public static void removeTheElementGraterThanFife(List<String> list){
       // list.removeIf(t-> t.length()>5);
       // System.out.println(list);
    //}

    //Remove the elements if the length is between 8 and 10 or ending with 'o' (8 and 10 inclusive)

   // public static void remove8and10AndEndingO (List<String> list){
       // list.removeIf(t-> (t.length()<11 && t.length()>7)||t.endsWith("o"));
       // Predicate<String> checkCondition=t-> (t.length()<11 && t.length()>7)||t.endsWith("o");
       // list.removeIf(t-> checkCondition.test(t));
       // System.out.println(list);
  //  }


    //Create a method to check if the lengths of all elements are less than 12
    public static boolean checkElementOfLengthLessThan12(List<String> list){
       return list.stream().distinct().allMatch(t-> t.length()<13);
    }
    //Create a method to check if the initial of any element is not 'X'
    public static boolean checkNotStartX(List<String> list){
        return list.stream().allMatch(t-> t.startsWith("X"));//false
    }

    public static boolean checkNotStartX02(List<String> list){
        return list.stream().noneMatch(t-> t.startsWith("X"));//true
    }
    //Create a method to check if at least one of the elements ending with "r"
    public static boolean checkListMatchR(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }







}
