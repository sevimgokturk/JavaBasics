package day16Arrays;

public class Arrays06 {
    public static void main(String[] args) {
        //Print the words ending with "y".
        // (Make code case-insensitive)
        String t = "Learn Java, earn money.";
        t=t.replaceAll("\\p{Punct}","");
        String array[]=t.split(" ");
        int counter=0;
        for ( String w:array ){
            if(w.endsWith("y")){
                counter++;
                System.out.println(w);
            }
        }
        System.out.println(counter);

        }

}
