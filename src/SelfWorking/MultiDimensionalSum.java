package SelfWorking;

public class MultiDimensionalSum {
    public static void main(String[] args) {
       int arr1[][]={ {1,2,3}, {4,5,6} };
        System.out.println(sumOfElements(arr1));

    }
    public static int sumOfElements(int arr[][]){
        int sum=0;
        for (int w [] :arr){
            for (int c: w){
                sum=sum+c;
            }
        }
        return sum;
    }



}
