package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter");
        int length = scan.nextInt();
        if (length < 0) {
            System.out.println("enter again");
        } else {
            int array[][] = new int[length][length];

            for (int w[] : array) {
                for (int c : w) {
                   c=length;
                }
            }
            System.out.println(Arrays.deepToString(array));
        }

    }
}
