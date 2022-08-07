package day27Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/osmangok/IdeaProjects/winter2022java/src/day26Exception/File01.txt");
        int k = 0;
        while( (k = fis.read()) != -1){
            System.out.print((char) k);
        }
        System.out.println("=====================");
        printAge(-1);

    }
    public static void printAge(int age){
        if(age>=0) {
            System.out.println(age);
        }else {
            throw new IllegalArgumentException("ages can not be negative");
        }
    }

}
