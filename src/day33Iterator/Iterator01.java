package day33Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        List<String> list2 = new LinkedList<>();

        for ( String w: list1){
            w=w+"ii";
            list2.add(w);
            System.out.println(w);
        }

        System.out.println(list1);// it can update the array so we need to create a new list or make all with iterator
        System.out.println(list2);

       // list1.set(1,"S");
       // System.out.println(list1);//set metodu loop disinda calisiyor ama loop icinde calistirmak icin iteratora ihtiyac var

       // for ( String w: list1){
          // list1.remove(w);//it dont allow to remove inside the for loop
       // }
        //list1.remove(w); // it works outside the loop
       // System.out.println(list1);

        ListIterator listIterator= list1.listIterator();
        while (listIterator.hasNext()){
           Object element = listIterator.next();
           listIterator.set(element+"EEEEE");

        }
        System.out.println(list1);
        //When we use Iterator, we can modify all elements of a list at the same time
       //we cannot do modification with For each loop, but we can read the date with for each loop
        ListIterator listIterator1= list1.listIterator();
        while (listIterator1.hasNext()){//control is empty or not one by one
            Object element = listIterator1.next();//take the element one by one

                listIterator1.remove();//remove the element one by one

        }
        System.out.println(list1);


/*
while (listIterator1.hasNext()){//control is empty or not one by one//foreach farkli bir versiyonu sanki
            Object element = listIterator1.next();//take the element one by one
            if(element.toString().equals("CEEEEE")){
                listIterator1.remove();//===>[AEEEEE, BEEEEE]
            }
 */


        /*
        we have
        next() => get elements in ascending order
        previous() => get elements from last index
        hasPrevious() => true or false if element exists from the current pointer to previous ones
        hasNext() => true or false if element exists from first index
        remove() => deletes current element
        set() => update current element

        Iterators: When we use iterators, we can make modifications on collections for multiple data
        Collections: Lists, Sets and so on

         We have also Iterator

        1) when we use Iterator, we will NOT have hasPrevious or previous methods
        2) we can use ListIterator only with lists in Java, but Iterator can be used for all collections

         */





    }
}
