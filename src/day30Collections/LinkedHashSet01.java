package day30Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        LinkedHashSet <Integer> lhs =new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(33);
        lhs.add(10);
        lhs.add(10);
        lhs.add(32);
        lhs.add(5);
        lhs.add(5);
        System.out.println(lhs);

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(33);
        list.add(10);
        list.add(10);
        list.add(32);
        list.add(5);
        list.add(5);
        System.out.println(lhs);

        //Interview Question: Display all arrayLİst elements at once on th console

        LinkedHashSet <Integer> lhs1 =new LinkedHashSet<>(list);
        System.out.println(lhs1);
       // lhs.addAll(list); 2.way

    }
}
