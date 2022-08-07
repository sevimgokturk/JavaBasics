package day19TestByValueDayTimeClases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer arr[] ={ 3,4,5,6};
       List<Integer> list=  Arrays.asList(arr);//size is fixed because of that we cant remove or add an element
        System.out.println(list);
        //Try to remove an element from list
        //list.remove(1);
        //System.out.println(list);

        //Try to add an element from list
        // list.add(7);
        //System.out.println(list);

        // try to clear the list
        //list.clear();
        //System.out.println(list);


        // bast way for convert an array to a list is using loop









    }
}
