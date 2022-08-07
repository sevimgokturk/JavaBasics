package practice03;

public class Q04 {
    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 9, 4, 23, 12};

        //Print just last two elements--use continue
        int length= arr.length;
        for (int i =0; i<length; i++){
            if(i<length-2){
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println("================================");

        //Print just first three elements --use break

        for (int i =0; i<length; i++){
            if(i>2){
                break;
            }
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
        System.out.println("=======================================");

        //int arr[] = {3, 1, 7, 9, 4, 23, 12};
        //Print the elements from index 2 to index 4

        for (int i =2 ; i<5; i++){
            System.out.print(arr[i]+" ; ");
        }
        System.out.println();
        System.out.println("=======================================");
        //2.Way
        //int arr[] = {3, 1, 7, 9, 4, 23, 12};
        //Print the elements from index 2 to index 4
        for (int i =0 ; i<length; i++){
            if(i<2){
                continue;
            }
            if (i>4){
                break;
            }
            System.out.print(arr[i]+" - ");
        }












    }
}
