package day29Collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList <String> ll1 = new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Marc");
        ll1.add("Tom");
        System.out.println(ll1);
        String firstElement= ll1.element();// return the first element of the list
                                            //without removing any elements

        System.out.println(ll1);
        String firstElemnts2= ll1.poll();//return the first element of the list
                                        //by removing elements
        System.out.println(firstElemnts2);
        System.out.println(ll1);

        String firstElement3= ll1.peek();// return the first element of the list
                                        //without removing any elements
        System.out.println(firstElement3);
        System.out.println(ll1);



        LinkedList <String> ll2 = new LinkedList<>();
        System.out.println(ll2);
        System.out.println(ll2.peek());// null
        //System.out.println(ll2.element());//will return NoSuchElementsExceptions

        LinkedList <Integer> ll3 = new LinkedList<>();
        ll3.add(0,3);
        ll3.add(1,4);
        ll3.add(2,7);
        ll3.add(3,7);
        System.out.println(ll3);










    }
}
