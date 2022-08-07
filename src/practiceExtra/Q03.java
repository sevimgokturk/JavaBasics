package practiceExtra;

import java.util.Arrays;

public class Q03 {
    static String str;
    public static void main(String[] args) {
        /*
         * create a method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         */
        charName("sevim");
        charNameOrder("ABCabc");


    }
    public static  void charName(String name){
        char array []=new char[name.length()];
        for( int i=0; i<name.length(); i++){
            array[i]=name.charAt(i);
        }
        System.out.println(Arrays.toString(array));
    }
    //:::::::::::::SELF WORKING:::::::::::::::::::::::::::
    public   static void charNameOrder(String name){
        char array[]= new char[name.length()];
        for (int i=0;i<name.length(); i++){
            array[i]=name.charAt(i);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }








}
