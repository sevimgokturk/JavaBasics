package SelfWorking;

import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            for (int c=1; c<11; c++){
                System.out.print(c*i+" - ");
            }
            System.out.println();
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("enter");
        int num=scan.nextInt();


    }
}
