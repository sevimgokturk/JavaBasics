package day21;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        1) String Class is immutable but StringBuilder  mutable
        2)immutable means update will not  reflected to the original String without assignment
        3) mutable means update will be reflected to the original String without assignment
         */
        String s="Ali";
        System.out.println(s+"!");
        System.out.println(s+"!"+"?");

        StringBuilder sb1 =new StringBuilder("Ali");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder();
        // java gives  16 boxes for teh characters whose numbers are less than 16
        System.out.println("for empty : "+ sb2.capacity());
        sb2.append("Veli");
        sb2.append("Han").append("!.....").append("xxxxx");
        System.out.println(sb2);
        System.out.println(sb2.length());
        //java gives 2 times existing boxes  plus 2 if you use characters more there existing boxes
        System.out.println("for non empty : "+ sb2.capacity());

        //3.way:
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("Fl!");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
        StringBuilder sb4 = new StringBuilder("Mississippi");
        System.out.println(sb4.lastIndexOf("s"));
        //Take the first 7 indexes , return the index of last occurrence of "s"
        System.out.println(sb4.lastIndexOf("s",7));
        System.out.println(sb4.insert(2,"XXX"));
        System.out.println(sb4.insert(1,"ABCD", 1,3));

        System.out.println(sb4.delete(4,7));
        System.out.println(sb4.deleteCharAt(1));
        System.out.println(sb4.deleteCharAt(1));
        System.out.println(sb4.replace(2,4,"S"));
        System.out.println(sb4.reverse());
        StringBuilder sb5 = new StringBuilder("Ali Can");
        StringBuilder sb6 = new StringBuilder("Ali Can");
        StringBuilder sb7 = new StringBuilder("ali Can");
        System.out.println(sb6.compareTo(sb5));
        System.out.println(sb5.compareTo(sb7));
        System.out.println(sb7.compareTo(sb5));
        System.out.println(sb5.substring(3));
        System.out.println(sb5.toString().toUpperCase());

        String stringFromStringBuilder= sb5.toString();
        StringBuilder stringBuilderFromString= new StringBuilder(stringFromStringBuilder);








    }
}
