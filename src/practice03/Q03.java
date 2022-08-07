package practice03;

public class Q03 {
    public static void main(String[] args) {
        /*
         Create a method and
		 from a given array find all pairs whose sum is a given number,
		 {4,6,5,-10,8,5,20} ===> 10
		 4 + 6 = 10
         5 + 5 = 10
        -10 + 20 = 10
		 */
        int ar[]={4,6,5,-10,8,5,20};
        int length= ar.length;
        for (int i=0; i<length; i++){
            for (int c=0; c<length; c++){
                if(ar[i]+ar[c]==10){
                    System.out.println(ar[i] + " + " + ar[c] + " = " + " 10 ");
                }
            }
        }
        System.out.println("===============================");


    }
}
