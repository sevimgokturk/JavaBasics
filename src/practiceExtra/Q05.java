package practiceExtra;

public class Q05 {
    public static void main(String[] args) {
        /*
         * create a method(make return type boolean) to test
         * if an array contains a specific value-returns true or false
         * Then print the result in main method
         *
         * input[]= {1,2,3,4,5,6,7} num:6
         * Output : "Array contains 6"
         */
        int []array2={1,2,3,4,5,6,7};
        int num=6;
        // call method

        if(checkElements(array2,num)){
            System.out.println("contains");
        }else{
            System.out.println("not");
        }

    }
    public static boolean  checkElements(int array[], int num){

        boolean result =false;
        for (int each : array){
            if(each==num){
                result=true;
            }
        }
        return result;

    }
}
