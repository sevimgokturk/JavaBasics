package day07String;

public class St02 {
    public static void main(String[] args) {
        String str = "ali can";
        String newStr= str.concat("!...").concat("Congrats...!");
        System.out.println(newStr);
        //you can do concatenation by using + signe , also with concat method
        boolean lastStr= str.endsWith("n");
        System.out.println(lastStr);
        //
        boolean firstStr=str.startsWith("ali");
        System.out.println(firstStr);
        //
        boolean fourth=str.startsWith("c",4);
        System.out.println(fourth);
        //concat
        //endWith
        //startWith




    }
}
