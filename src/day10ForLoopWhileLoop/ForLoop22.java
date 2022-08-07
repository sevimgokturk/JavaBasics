package day10ForLoopWhileLoop;

public class ForLoop22 {
    public static void main(String[] args) {

        String s="1234";
        String rev="";

        for (int i3=s.length()-1;i3>1; i3++){
            rev=rev+s.charAt(i3);
        }
        if(s.equals(rev)){
            System.out.println("pal");
        }else {
            System.out.println("not pal");
        }
    }
}
