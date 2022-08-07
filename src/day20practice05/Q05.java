package day20practice05;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        /*
         * Create an integer list which has 5 elements
         * Update all elements by adding "*" on the right of every element
         */
        List<Integer> list= new ArrayList<>();
        List<String>list1=new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        for (int w: list){
            list1.add(String.valueOf(w+"*"));

        }

        System.out.println(list1);




    }
}
