package day26Exception;

public class E03 {
    public static void main(String[] args) {
        String str="";
        getNumOfCharactersInAString(str);
        String str1="Ali Can";
        getNumOfCharactersInAString(str1);
        String str2=null;
        getNumOfCharactersInAString(str2);
    }

    public static void getNumOfCharactersInAString(String str){
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("issue occurred when I want to count the number of character"+e.getMessage());
             e.printStackTrace();//if you want to see the detail about the issues  use   e.printStackTrace();
             /*

             java.lang.NullPointerException
             at day26Exception.E03.getNumOfCharactersInAString(E03.java:15)
             at day26Exception.E03.main(E03.java:10)
              */
        }

    }
}
