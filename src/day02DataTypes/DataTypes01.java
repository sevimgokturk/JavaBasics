package day02DataTypes;

public class DataTypes01 {

    /*
  What is the difference between "primitive" and "non-primitive" data types?
 1)primitive data types contain just values, non-primitive data types contain value + method
 2)primitive data type names use just lowercase characters, but non-primitive data type names use uppercase at the beginning
 3)primitive data types were created by Java, developers cannot create primitive data types.
  But non-primitive data types can be created by Java and by any developer.
 4)non-primitive data types use same size area in memory but primitive data types use different size area in memory


      */
    public static void main(String[] args) {

        //primitive data types:boolean, char,byte, short, int , long, float, double,
        // 1  boolean has 2 values true or false , a boolean variables just a bit area
        boolean isRetired = false;
        boolean isOld = true;
        // 2  char is for just a single caracter it uses 16 bit in memory
        char initial= 'A' ;
       // 3   byte is for whole numbers between -128 and 127   ,   8 bits
        byte age=14;
        byte mathGrades = 76;

        // 4  short is for whole numbers between -32768 and 32767, 16 bits

        short numberOfScholsInASchool = 2134;

        // 5   int is for whole numbers ranges -2,147,483,648 to 2,147,483,647  ,  32 byte
        int annualProfitOfAppel=2000000;

        /* 6 long is for whole numbers ranges  9,223,372,036,854,755,808 and 9,223,372,036,854,755,807
        64 bit
        not forget to put "L" to the end of the value
         */
        long populationOfWorld = 7000000000L;

        // 7 float is for decimals. 32 bit in memory
        // do not forget put "F" or "f"
        float priceOfShirts= 12.99F;


        // double is for decimal numbers 64 bit
        //
        double weightOfACell=0.99999900007;


        //non primitive data String
        String s="Sevim";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String n = "nil";
        System.out.println(n.toUpperCase());
        String s1 = new String("idil");
        System.out.println(s1.length());
        String s2 = new String("yagmur");
        System.out.println(s1);
        int x=130;
        char y = (char)x;
        char c = '\'';
        x=(char)c;
        System.out.println(x);

        System.out.println(y);
        float x1=3.8888866666611F;
        System.out.println(x1);
        double x2= 22222.222222222222222222222222222222222222222222222222222;
        System.out.println(x2);
        double x3 = 333_333_333_333_333_333_333_333.0;
        System.out.println(x3);
        long x4 = 3_333_333_333_333_333_333L;
        System.out.println(x4);






    }
}
