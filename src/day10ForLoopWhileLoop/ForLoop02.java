package day10ForLoopWhileLoop;

public class ForLoop02 {
    public static void main(String[] args) {
        int num=12321;
        String str1=String.valueOf(num);
        String rev1="";

        for (int i4=str1.length()-1 ;i4>1;  i4++){
            rev1 = rev1+str1.charAt(1);
        }
        if(str1.equals(rev1)){
            System.out.println("pal");
        }else {
            System.out.println("not pal");
        }

        System.out.println("==================================");





    }
}
