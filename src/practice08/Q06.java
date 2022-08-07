package practice08;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {

    /*
     Create an array and create a  method to find the number of positive numbers and sum of
	 the non-positive numbers
	 Return type must be int array
	 [a,b]
		 */
        int [] array= {-2,-4,5,-3,7,9,1,0,-9};
        met(array);

    }
    public static void met(int [] array){

        int sum=0;
        int counter=0;
        for (int w: array){
            if(w<0){
             sum=sum+w;
            }else {
              counter++;
            }
        }
        int [] arr= {counter,sum};
        System.out.println(Arrays.toString(arr));
    }
}
