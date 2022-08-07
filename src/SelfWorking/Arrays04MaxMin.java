package SelfWorking;

public class Arrays04MaxMin {
    // write a program that display the max and minimum element
    public static void main(String[] args) {
        int ar[]= {3,5,7,0,12};
        int length = ar.length;
        int max = ar[0];
        int min = ar[0];
        for (int i=0 ; i <length; i++){
            max= (ar[i]>max ?  ar[i] : max);
            min= (ar[i]<min ? ar[i] : min);

        }
        System.out.println("max = "+ max);
        System.out.println("min = " + min);




    }
}
