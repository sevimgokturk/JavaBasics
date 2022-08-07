package day20practice05;

public class Q06 {
    public static void main(String[] args) {

        /*
         * Type a code that calculates the average value of array elements
         *
         * input[]= {1,2,3,4,5,6,7,1}
         * Output : 4
         */
        int input[]= {1,2,3,4,5,6,7,2};
        int length= input.length;
        double sum=0;
        for (int w : input){
            sum=sum+w;
        }
        System.out.println("sum= "+ sum+ ",  average= "+sum/length);







    }
}
