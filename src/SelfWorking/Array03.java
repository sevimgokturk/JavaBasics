package SelfWorking;

public class Array03 {
    //writing a program that display
    // the number of occurrence of an element in the array
    public static void main(String[] args) {
        int ar[]={0, 0, 1, 1, 11, 2, 4, 4, 4};
        int length= ar.length;
        for (int i=0; i<length; i++){
            int counter=0;
            for (int c=0; c<=i; c++){
                if(ar[i]==ar[c]){
                 counter++;
                }
            }
            System.out.println(ar[i]+" occurs "+ counter + "times ");
        }






    }




}
