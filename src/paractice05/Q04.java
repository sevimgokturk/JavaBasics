package paractice05;

public class Q04 {
    public static void main(String[] args) {
        int total=0;
        StringBuilder letters= new StringBuilder("abcdefc");
        total+=letters.subSequence(1,2).length();
        total+=letters.substring(6,6).length();
       // total+=letters.substring(6,5).length();
        System.out.println(total);



    }
}
