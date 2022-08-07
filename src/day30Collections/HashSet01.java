package day30Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
        /*

        Set is a collection that is used for unique elements.
        Hash is a technique to create unique codes for each data
        HashSet is fast in operation because they do not use any specific order for data(insertion, natural)
        HashSet accepts null values.

        set is a collection, it is used for unique elements . has is a technique to
         */
        HashSet <String> hs =new HashSet<>();
        hs.add("K");
        hs.add("K");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        HashSet <String> hs2 =new HashSet<>();
        hs2.add(null);
        hs2.add("K");
        System.out.println(hs2);
        System.out.println(hs.equals(hs2));


        //Interview Question: Type a code to display arrayList elements only once

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(3);

       // HashSet <String> hs3 =new HashSet<>(list);
        //hs3.addAll(list);

        Set<String> set= new HashSet<>();
        set.add("A");
        set.add("B");
        set.add(null);
        set.add("B");
        System.out.println(set);




    }
}
