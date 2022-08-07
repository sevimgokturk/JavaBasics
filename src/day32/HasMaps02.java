package day32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMaps02 {
    /*Create a HashMap and give key value pairs as following;
Math = 8
Java = 9
SDLC = 9
API  = 7
 */
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("Math",8);
        hm.put("Java",9);
        hm.put("SDLS",9);
        hm.put("API",7);
        System.out.println(hm);

        //When we use maps, we can use "keySet()" method to print all keys on the console
        Set<String> keys=hm.keySet();
        for (String w:keys){
            System.out.print(w+" ");
        }
        System.out.println();
        Collection<Integer>  values = hm.values();
        for (Integer w:values){
            System.out.print(w+" ");
        }
        System.out.println();
        Set<Map.Entry<String,Integer>> setForm =hm.entrySet();

        System.out.println(hm.entrySet());
        for (Map.Entry<String,Integer> w: setForm){
            System.out.print(w+" ");
        }

        //When we use maps, we can use "values()" method to print all values on the consol
        //HOw cam see the courses with grades grater than 8 on the console.
        //When we get a specific value from map, we can use "get()"
        for (Map.Entry<String,Integer> w : setForm){
            if (w.getValue()>8){
                System.out.println("the courses with grades greter than "+ w.getKey());
            }
        }

        Integer oldValue = hm.replace("SDLS",10);
        System.out.println(oldValue);

        Boolean isTrue= hm.replace("API",7,10);
        System.out.println(isTrue);
        System.out.println(hm.get("API"));


        Integer removeValue = hm.remove("SDLS");
        System.out.println(hm.get("SDLS"));
        System.out.println(hm);

        Boolean isCorrect = hm.remove("Math",8);
        System.out.println(hm.get("Math"));
        System.out.println(hm);

        boolean isRight= hm.remove("API", 12);
        System.out.println(isRight);







    }
}
