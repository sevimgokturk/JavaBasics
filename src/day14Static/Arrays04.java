package day14Static;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        // [0, 2, 3, 0, 12, 0] put the zeros to the end

        int ar [] = new  int[6] ;
        int length = ar.length;
        ar[0]=0;
        ar[1]=2;
        ar[2]=3;
        ar[3]=0;
        ar[4]=12;
        ar[5]=0;

        int emty [] = new  int[6];
        int idx=0;

        for (int i=0; i<length; i++){
            if(ar[i]!= 0){
                emty[idx]= ar[i];

                idx ++;
            }
        }
        System.out.println(Arrays.toString(emty));

        System.out.println("==================");
        int i =0 ;// bu yontem calismadi
        for (int w : ar ) {
            if (w != 0) {
                ar[i] = w;
                i++;
            }
        }
        System.out.println(ar);











    }

}
