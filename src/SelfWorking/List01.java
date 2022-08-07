package SelfWorking;

import java.util.ArrayList;

public class List01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("F");
        System.out.println(list);
        System.out.println("================");

        list.add(1,"B");
        System.out.println(list);

        System.out.println("===================");

        list.set(3,"D");
        System.out.println(list);

        System.out.println("==================");

        list.remove(4);
        System.out.println(list);

        System.out.println("===================");

        System.out.println(list.size());


    }
}
