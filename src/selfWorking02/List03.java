package selfWorking02;

import java.util.ArrayList;
import java.util.Collections;

public class List03 {
    public static void main(String[] args) {
        //Find the closest 2 integers in the given list. [12, 15, 10, 21]
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(12);
        list1.add(15);
        list1.add(10);
        list1.add(20);
        list1.add(17);
        list1.add(16);
        list1.add(11);
        list1.add(22);
        //If you want to use list elements use the following code
        Collections.sort(list1);
        System.out.println(list1);














    }
}
