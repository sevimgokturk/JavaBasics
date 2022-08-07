package day32;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMap022 {
    public static void main(String[] args) {
            /*Create a HashMap and give key value pairs as following;
                Math = 8
                Java = 9
                SDLC = 9
                API  = 7
                 */

            HashMap<String,Integer> hm =new HashMap<>();
            hm.put("Math",8);
            hm.put("Java",9);
            hm.put("SDLS",9);
            hm.put("API",7);
            System.out.println(hm);
        Set<Map.Entry<String, Integer>> set= hm.entrySet();
        for (Map.Entry<String, Integer> w : set){
            System.out.println(w.getValue()+":"+ w.getKey());
        }
        System.out.println("all keys"+hm.keySet());//all keys// return set
        System.out.println("all values"+hm.values());// all values//return collection
        System.out.println("Spesific value"+hm.get("Java"));//specific value// returne String
        System.out.println("All keys and values"+hm.entrySet());//all keys and values//return Set<Map.Entry<Key,Value>>

        //when we use map we can print them as a map
        //
        double a=3;
        int b;
        Object c = null;
        b=(int) a;
        b=(int) c;





    }
}
