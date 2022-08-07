package day27Exception;

public class E02 {
    public static void main(String[] args) {
          /*
    Note: If Exceptions happen after executing code on the console, the Exceptions are called "Run Time Exception"
          The other name of "Run Time Exception" is "Unchecked Exceptions"

   Run Time Exceptions:
    1) ArithmeticException   2)ArrayIndexOutOfBoundsException    3)NullPointerException  4)NumberFormatException
    5)StringIndexOutOfBoundsException 6)ClassCastException
     */
        Object obj=70;
        convertAnObjectToString(obj);

    }
    public  static void convertAnObjectToString(Object obj){
        try {
            String s = (String) obj;
            System.out.println(s);
        }catch (ClassCastException e){
            System.err.println("An issue occurred "+e.getMessage());
        }
    }
}
