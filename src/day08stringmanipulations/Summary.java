package day08stringmanipulations;

public class Summary {
    public static void main(String[] args) {

        /*

        There is another structure for regular expressions
        1) \\s  means space character
        2) \\S means characters different from space character

        3) \\d means digits
        4) \\D means different from digits

        5) \\w means A-Z and a-z 0-9  _
        6) \\W means different from A-Z and a-z and 0-9 and
        7) trim method : delete the space et the beginning and at the end
        8) isEmpty method: count space
        9) isBlanc method: not count space
        10) [A-Za-z]
        11) [^A-Za-z]
        12) [0-9]
        13) [^0-9]

 */

String a="    Shdlas Znc  1234   -__?!!.    ";
        System.out.println(a.trim());
        System.out.println(a.replaceAll("\\W","*"));
        System.out.println(a.replaceAll("\\w","*"));
        System.out.println(a.replaceAll("\\D","*"));
        System.out.println(a.replaceAll("\\d","*"));
        System.out.println(a.replaceAll("\\s","*"));
        System.out.println(a.replaceAll("\\S","*"));
        System.out.println(a.replaceAll("[14!? Zh]","*"));

        String b1="";
        String b2=" ";
        System.out.println(b1.isEmpty());
        System.out.println(b1.isBlank());

        System.out.println(b2.isEmpty());
        System.out.println(b2.isBlank());
            String str= "Canan Can";
            System.out.println(str.substring(3,3));




    }
}
