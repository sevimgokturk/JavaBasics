package practice03;

public class Q02 {
    public static void main(String[] args) {
        //Create a String array whose elements are :
        // Ali, John, ALI, Brad, Mary, Ayse
        //print the elements whose indexes are even on the console
        String ar[]={"Ali", "John","ALI","Brad", "Mary","Ayse"};
        int length = ar.length;

        for (int i =0; i<length; i++){
            if (i%2==0){
                System.out.println(ar[i]);
            }
        }


    }
}
