package day18ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList03 {
    public static void main(String[] args) {
        //Find the closest 2 integers in the given list.
        // [12, 15, 10, 21] ==> 10 and 12
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(12);
        list1.add(15);
        list1.add(11);
        list1.add(21);
        list1.add(10);
        list1.add(13);
        list1.add(11);
        list1.add(22);
        //If you want to use list elements use the following code
        Collections.sort(list1);
        System.out.println(list1);
       //2.Way
        int min =Integer.MAX_VALUE;
        for ( int i=0; i<list1.size()-1;i++){
            min=Math.min(min,list1.get(i+1)-list1.get(i));
        }
        for (int i=0; i<list1.size()-1; i++){
            if(list1.get(i+1)-list1.get(i)==min){
                System.out.println(list1.get(i+1)+"-"+list1.get(i));
            }
        }




    }
}
