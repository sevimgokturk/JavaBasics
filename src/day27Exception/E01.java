package day27Exception;

public class E01 {
    /*
       1) You can use multiple catch blocks with a try block
       2) When you use multiple catch blocks just one of them can be executed at the same
       3) try-block cannot be used alone.
        */
    public static void main(String[] args) {
        String s="Hello";
        getCharacterFromStringByIndex(s,2);
        getCharacterFromStringByIndex(s,6);
        System.out.println("==============================");
        divideTheLengths(s,2,5,3);
        divideTheLengths(s,1,5,1);
        divideTheLengths(s,5,2,4);


    }
    public static void getCharacterFromStringByIndex(String str, int idx){
        try {
            System.out.println(str.charAt(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Aa issue occurred in character selection"+e.getMessage());

        }
    }
    public static void divideTheLengths(String str, int idx1, int idx2, int idx3){
        try {
            int firstlength = str.substring(idx1,idx2).length();
            int secondlength= str.substring(idx1,idx3).length();
            System.out.println(firstlength/secondlength);
        }catch (StringIndexOutOfBoundsException e){
            System.err.println("an issue occurred in character selection "+e.getMessage());
        }catch (ArithmeticException w){
            System.err.println("an issue occurred in division"+w.getMessage());
        }
    }
    //



}
