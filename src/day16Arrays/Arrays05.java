package day16Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Find the vowels in a String by using arrays.
        // Print them on the console
        // a e i o u
        int counter=0;
        String s= "Learn java, earn money";
        String array[]=s.split("");
        for (String w : array){
            if(w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||w.equalsIgnoreCase("i")||w.equalsIgnoreCase("o")||w.equalsIgnoreCase("u")||w.equalsIgnoreCase("y"));
            System.out.print(w+" ");
            counter++;
        }
        System.out.println();
        System.out.println(counter);







    }
}
