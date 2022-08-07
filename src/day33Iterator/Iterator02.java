package day33Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        ListIterator listIterator= list1.listIterator();
        while (listIterator.hasNext()){
            Object element=listIterator.next();
            System.out.println(element);
        }

        while (listIterator.hasPrevious()){
            Object element=listIterator.previous();
            System.out.println(element);
        }
        /*
         hasNext() => checks the condition for elements of a collection
                next() => gets elements 1 by 1

                hasPrevious() => checks the elements starting from the last index

                previous() => get the last element

                remove() => delete the current element

                next vs hasNext => next returns thelement, but hasNext returns true or false if element exists or not

                hasPrevious vs previous => it returns true or false if the element from last index exists, but previous will take the last index and give element from last  going through first

                ListIterator => it is applicable only for LISTS
                hasNext, next, hasPrevious, previous, remove, set
                Iterator => it applies to all collections
                hasNext, next, remove
         */
    }
}
