package day31Maps;

import java.util.HashMap;
import java.util.Map;

public class jj {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();

        map1.put("A", "Apple");

        map1.put("B", "Ball");

        map1.put("C", "Cat");

        map1.put("A", "Gun");

        map1.put("B", "Kite");

        map1.put("A", "Mat");
        System.out.println(map1.values().size() );

    }
}
