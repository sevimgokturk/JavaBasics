package SelfWorking;

public class MultidimensionalProductOfLastElements {
    public static void main(String[] args) {
        int array1[][]= { {1,2,3}, {4,5}, {6} };
        System.out.println(productOfLastElements(array1));

    }


    public static int productOfLastElements(int array[][]){
        int product=1;
        int size=array.length;
        for (int i=0; i<size; i++){
            for (int c=0; c<array[i].length; c++){
                product=product*array[i][c];
            }
        }

        return product;
    }




}
