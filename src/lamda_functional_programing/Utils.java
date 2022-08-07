package lamda_functional_programing;

import java.util.List;

public class Utils {
    public static void printInSameLineWithSpace(Object o){
        System.out.print(o+" ");
    }
    public static void printElementWithStar(Object o){
        System.out.println(o+"*");
    }
    public static boolean checkEvenElement(Integer o){
        return o%2==0;
    }
    public static boolean isOdd(Integer o){
        return  o%2!=0;
    }
    public static Integer getSquare(Integer o){
        return o*o;
    }
    public static Integer getCube(Integer o){
        return o*o*o;
    }
    public static Double getHalf(Integer o){
        return o/2.0;
    }
    public static char getLastChar(String str){
        return str.charAt(str.length()-1);

    }
    public static char getFirstChar(String str){
        return str.charAt(0);

    }




}
