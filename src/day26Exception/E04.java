package day26Exception;

public class E04 {
    public static void main(String[] args) {
        convertToStringToInteger("123");
        convertToStringToInteger("0");
        convertToStringToInteger("ggg");

       // Integer.valueOf()==>Integer
       // Integer.parseInt() ==>int


    }
    public static void convertToStringToInteger(String str){
        try {
            System.out.println(Integer.valueOf(str)+1);
        }catch (NumberFormatException e){
            System.err.println("String can not convert to an integer "+e.getMessage());
        }




    }
}
