package practice04;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
        /*
Write code to find the sum of the dollars and sum of the euros
 in the given string
 String s = "$1 $12 €34 €56 $45 €78";
 */
        String s = "$1 $12 €34 €56 $45 €78";
        String array[]=s.split(" ");
        int sumDollars=0;
        int sumEros=0;
       for (String w: array){
           if(w.contains("$")){
              sumDollars= sumDollars+Integer.valueOf(w.replace("$",""));
           }else {
               sumEros=sumEros+ Integer.valueOf(w.replace("€",""));
           }
       }
        System.out.println("$"+ sumDollars);
        System.out.println("€"+sumEros);





    }
}
