package day30Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        /*
        If you need to use elements in a natural order, then use TreeSet it will sort elements in ascending order.
        HashSet is faster than TreeSet but TreeSet can order elements.
         */

//        TreeSet<Integer> ts1 = new TreeSet<>();
//        ts1.add(35);
//        ts1.add(12);
//        ts1.add(58);
//        ts1.add(0);
//        ts1.add(-9);
//        ts1.add(2);
//        ts1.add(12);
//        ts1.add(35);
//        System.out.println(ts1);//[-9, 0, 2, 12, 35, 58]

        /*
        Interview Question: How to store unique elements in natural order?
        We can use TreeSet.
        Yes, but as you know it is slow. how can you make it faster?
        I will create a HashSet and add all elements to a HashSet then I can convert it to a TreeSet
         */
        TreeSet <Integer> tr1= new TreeSet<>();
        tr1.add(-9);
        tr1.add(2);
        tr1.add(5);
        tr1.add(-33);
        tr1.add(2);
        tr1.add(22);
        tr1.add(-9);
        System.out.println(tr1);

        TreeSet <String> tr2= new TreeSet<>();
        Long t1=System.nanoTime();
        tr2.add("M");
        tr2.add("Z");
        tr2.add("A");
        tr2.add("Z");
        tr2.add("L");
        tr2.add("B");
        tr2.add("K");
        tr2.add("B");
        System.out.println(tr2);
        Long t2=System.nanoTime();

        HashSet<String> set= new HashSet<>();
        set.add("M");
        set.add("Z");
        set.add("A");
        set.add("Z");
        set.add("L");
        set.add("B");
        set.add("K");
        set.add("B");
        System.out.println(set);

        TreeSet <String> tr3= new TreeSet<>(set);
        System.out.println(tr3);
        Long t3=System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);






    }

}
