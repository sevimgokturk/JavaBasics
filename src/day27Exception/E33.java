package day27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E33 {
    public static void main(String[] args) {
        goAndReadTheFile();

    }

    public static void goAndReadTheFile(){
        try {
            FileInputStream fis1=new FileInputStream("src/day27Exception/File011.txt");// go and find the file
            int k=0;
            while ((k=fis1.read())!=-1){//read() method gives us asci value
                System.out.print((char) k);// explicit type casting
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("there is an issue about reaching out the fle or existence oh the file" +e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Connection with cloud is broken");
        }
    }
}
