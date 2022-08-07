package day32;

import java.util.Arrays;
import java.util.HashMap;



public class Interview {
    /*
        How to count the number of occurences of the words in a sentence
        For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                      Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
 */
    public static void main(String[] args) {
        String str ="Java is easy. Type codes to learn Java. To earn money learn Java.";
        String words[]= str.replaceAll("\\p{Punct}", "").split(" ");//get rid of some punct by using regex
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String w : words){
            Integer numberOfOccurence = hashMap.get(w);
            if(numberOfOccurence==null){
                //if the word does not exist in the map, this part will be executed
                hashMap.put(w,1);
            }else {
                //if the word  exist in the map, this part will be executed
                hashMap.put(w,numberOfOccurence+1);
            }
        }
        System.out.println(hashMap);




    }
}
