package day08stringmanipulations;

public class Sn02 {
    public static void main(String[] args) {
        //trim method :
        String fullName= "   Ali Can   ";
        System.out.println(fullName.trim());
        //how can i undersand if a string is empty or not
        int mumOfChar=fullName.length();
        if(mumOfChar==0){
            System.out.println("empty");
        }else {
            System.out.println("not empty");
        }


        System.out.println(fullName.isEmpty());
        System.out.println(fullName.isBlank());



        String empty="";
        boolean isEmpty=empty.isEmpty();//not count space
        System.out.println(isEmpty);// count space









    }
}
