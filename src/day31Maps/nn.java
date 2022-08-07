package day31Maps;

import java.util.LinkedList;
import java.util.Queue;

public class nn {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);

        queue.add(5);

        queue.add(7);

        queue.add(9);

        queue.add(11);
        queue.remove();
        System.out.println(queue);
    }
}
