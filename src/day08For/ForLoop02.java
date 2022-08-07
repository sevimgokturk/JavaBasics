package day08For;

public class ForLoop02 {
    public static void main(String[] args) {


        String s ="Java";
        for (int i =0; i<s.length() ; i+=1  ){
            System.out.print(s.charAt(i)+"*");
        }



        String s1 ="Hello";
        for (int i1=0; i1<=s.length();  i1++){
            if( s1.indexOf(s1.charAt(i1)) == s1.lastIndexOf(s1.charAt(i1))){
            System.out.print(s1.charAt(i1));
        }}



            String a = "AliCan";
            String noSpace= a.replace(" ","");
            for (int i2=noSpace.length()-1; i2>-1 ; i2-=1){
                System.out.print(noSpace.charAt(i2));

            }
















    }
}
