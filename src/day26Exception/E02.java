package day26Exception;

public class E02 {

    public static void main(String[] args) {
        String array[]={"Ali","Can","Veli","Han"};
        getAnElementFromAnArray(array,0);
        getAnElementFromAnArray(array,3);
        getAnElementFromAnArray(array,5);

    }
    public static void getAnElementFromAnArray(String arr[],int index){
        try {
            System.out.println(arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("An array occurred in array operation :" + e.getMessage());
        }


    }

}
