package day03typecastingwrapperscanner;

public class TypeCasting01 {
    public static void main(String[] args) {

//kucugu buyuge cevirirken problem olmaz(auto widwning)
        byte b = 47;
        int i = b;
        System.out.println(i);
// buyuk kucuk ise asagidaki gibi. problem cikarsa sorumluluk bizde (explicit narrowng)
        double m = 8.9 ;
        short n = (short) m ;
        System.out.println(n);
        int a1 = 513; // byte -128...... 127
        byte a2 = (byte) a1;
        System.out.println(a2);









    }
}
