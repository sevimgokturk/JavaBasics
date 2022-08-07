package SelfWorking;

public class MultidimensionalSumOfSameIndexElements {
    public static void main(String[] args) {
        /*
        3) Find the sum of the elements
        whose indexes are same in the given two multi dimensional arrays
         arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
         */
        int arr1[][] = { {1,2}, {3,4,5}, {6} };
        int arr2[][]= { {7,8,9}, {10,11}, {12} };
        System.out.println("Sum of the elements whose indexes are same :  "+ sumOfSameIndexElements(arr1,arr2));
    }



    public static int sumOfSameIndexElements(int array1[][],int array2[][]){
        int sum=0;
        int length1=0;

        if(array1.length<array2.length){
            length1=array1.length;
        }else {
            length1=array2.length;
        }

        for (int i=0; i<length1; i++){
            int length2=0;
            if(array1[i].length<array2[i].length){
                length2=array1[i].length;
            }else {
               length2= array2[i].length;
            }
            for (int j=0; j<length2; j++){
                sum=sum+array1[i][j]+array2[i][j];
            }
        }

        return sum;
    }





}
