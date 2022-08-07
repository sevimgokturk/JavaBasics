package SelfWorking;

import java.util.Arrays;

public class ARRAYmohammed {
    public static void main(String[] args) {
        String sentence="M o h a m e d";
        String str="";
        for ( int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)==' '){
                continue;
            }else {
                str=str+sentence.charAt(i);
            }
        }
        int length= str.length();
        char array[]=new char[length];
        for ( int i=0; i<length; i++){
            array[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(array));

    }

}
