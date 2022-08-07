package day17MultiDimentionalArrayList;

public class MultidimensionArrays03 {
    public static void main(String[] args) {
        //Find the maximum element in 2 dimensional array
        /*
        int ar[]= {3,5,7,0,12};
        int length = ar.length;
        int max = ar[0];
        int min = ar[0];
        for (int i=0 ; i <length; i++){
            max= (ar[i]>max ?  ar[i] : max);
            min= (ar[i]<min ? ar[i] : min);

         */
        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };
        int x=Integer.MIN_VALUE;


        for (int[] w: a) {
            for (int c: w) {
                if(x<c){
                    x=c;
                }
                }
            }
        System.out.println(x);









        }


}
