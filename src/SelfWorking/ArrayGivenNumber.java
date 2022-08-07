package SelfWorking;

public class ArrayGivenNumber {
    public static void main(String[] args) {
        int ar[]={0,1,3,5,2,7,4,6};
        int length = ar.length;
        int counter =0;
        for (int i =0; i<length; i++ ){
            for ( int c=0; c<length; c++){
                if( ar[i]+ar[c]==7){
                    System.out.println(ar[i]+"+"+ar[c]+"=7");
                    counter++;
                }
            }
        }
        if(counter<1){
            System.out.println(" ther arent any two elements which sum is 7");
        }




    }
}
