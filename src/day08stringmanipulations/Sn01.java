package day08stringmanipulations;

public class Sn01 {
    public static void main(String[] args) {
        String str = "Ali! is 13 years old, I think he is 15.";
        System.out.println(str.replace("13","**").replace("15","**"));//hard coding
        //regular expressions....chane group of data..."[0-9]..."[A-Z] " [^0-9]
        System.out.println(str.replaceAll("[^0-9- ]","!"));
// change all character different from letters to ?
        System.out.println(str.replaceAll("[^A-Za-z]","?"));
        System.out.println(str.replaceAll("[^0-9]","*"));
        System.out.println(str.replaceAll("[^ ]","*"));
        System.out.println(str.replaceAll("\\S","*"));
        System.out.println(str.replaceAll(" ","").length());
        System.out.println(str.replaceAll("\\s","").length());
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
        System.out.println(str.replaceAll("\\P{Punct}","").length());
        System.out.println(str.replaceAll("[^\\p{Punct}]","").length());




        /*

        There is another structure for regular expressions
        1) \\s  means space character
        2) \\S means characters different from space character

        3) \\d means digits
        4) \\D means different from digits

        5) \\w means A-Z and a-z 0-9  _
        6) \\W means different from A-Z and a-z and 0-9 and   _

 */







    }
}
