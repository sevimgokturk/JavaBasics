package day30Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDeque01 {
    public static void main(String[] args) {
        Queue<String> q1= new LinkedList<>();
        q1.offer("a");
        System.out.println(q1);
        //that one wiil be learn more while lamda instructions
        Queue<String> q2= new PriorityQueue<>();

        //Deque===> Double ended Queue =>FIFO+LIFO
        Deque<String> d1 = new LinkedList<>();
        d1.addFirst("A");
        d1.addFirst("B");
        d1.addFirst("C");
        d1.addLast("D");
        System.out.println(d1);

    }
}
