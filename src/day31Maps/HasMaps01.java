package day31Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMaps01 {
    public static void main(String[] args) {

    /*
    1) Maps use key-value structure.
    2) "keys" must be unique, "values" can be duplicated.
    3) "keys" cannot be null - except HashMaps, in HashMaps you can use "null" just once- as a key.
    4) "values" can use null many times.
    5)HashMap does not put elements in any order because of that HashMap is super fast.
    6) If you try to send into a map repeated key, Java will overwrite the value.
    7) HashMap is not thread safe and synchronized.
    ==> If you need some maps thread safe and synchronized ==> HashTable is thread safe and synchronized
    Note: Thread safety ==> thread safe or thread safe code in Java refers to code that can safely be utilized
                            in concurrent or multi- threading environment, and they will behave as expected.
     */

      HashMap<Integer,String> hm1 =new HashMap<>();
      hm1.put(100,"ALI");
      hm1.put(101,"VELI");
      hm1.put(102,"CAN");
      hm1.put(103,"CANAN");
      hm1.put(null,"ALIYE");
      hm1.put(null,"KEMAL");
      hm1.put(109,null);
      hm1.put(105,null);
      System.out.println(hm1);


      HashMap<Integer,String> hm2 =new HashMap<>();
        hm2.put(87,"K");
        hm2.put(88,"L");
        hm2.put(89,"M");
        hm2.putAll(hm1);
        hm2.put(100,"A");

        System.out.println(hm2);//When we add elements of a Map to another map,
                                // key and values data types' should be the same
        System.out.println("size : "+hm2.size());
        System.out.println(hm1.putIfAbsent(102,"Z"));
        System.out.println(hm2);//this means if keys exist create a new key value pair//not overwrite
        System.out.println(hm2.putIfAbsent(999,"Z"));
        System.out.println(hm2);


        System.out.println(hm1.get(101));
        System.out.println(hm1.get(555));
        System.out.println(hm1.getOrDefault(999,"this key is not exist"));
        System.out.println(hm1.getOrDefault(100,"this key is not exist"));

        Set<Integer> myKeys  =hm1.keySet();
        System.out.println(myKeys);

        Collection<String> myValue = hm1.values();
        System.out.println(myValue);

        System.out.println("============");
        Set<Map.Entry<Integer,String>> setForMap =hm1.entrySet();
        System.out.println(setForMap);
       for (Map.Entry<Integer,String> w : setForMap){
          // System.out.println(w);
           //System.out.println(w.getValue());
           System.out.println("key: "+w.getKey()+" "+ "value: "+w.getValue());
       }
         /*
    1) Maps use key-value structure.
    2) "keys" must be unique, "values" can be duplicated.
    3) "keys" cannot be null - except HashMaps, in HashMaps you can use "null" just once- as a key.
    4) "values" can use null many times.
​
    5)HashMap does not put elements in any order because of that HashMap is super fast.
    6) If you try to send into a map repeated key, Java will overwrite the value.
    7) HashMap is not thread safe and synchronized.
    ==> If you need some maps thread safe and synchronized ==> HashTable is thread safe and synchronized
​
    Note: Thread safety ==> thread safe or thread safe code in Java refers to code that can safely be utilized
                            in concurrent or multi- threading environment, and they will behave as expected.
     */






    }
}
