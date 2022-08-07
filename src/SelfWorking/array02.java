package SelfWorking;

public class array02 {
    //write a program that display the sum , product (multiplication of elements)
    // and average of the elements of an integer array
    public static void main(String[] args) {
        int[] numbers ={1, 5, -2, 1, -18};
        int length = numbers.length;
        int sum =0;
        int product=1;

        for (int w : numbers){
            sum = sum + w;
            product=product*w;
        }
        System.out.println("sum= " + sum);
        int average =sum/length;
        System.out.println("average= " + average);
        System.out.println("product=" +product);

    }
}
