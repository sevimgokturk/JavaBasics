package day27Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 /*
    1) When you use "throws" in the method name line, it means you are telling to Java " Hey Java, if you need help let me know"

    2) After "throws" keyword in the method name line, you can sue multiple Exception Classes like;
    throws IOException, ArithmeticExceptions

  **3)What are the differences between "throws" and "throw" keywords?
      a) "throws" can be used in method signature, "throw" can be used in method body
      b) After "throws" you can use multiple Exception Class Names.
         After "throw" you can use "new" keyword and the Constructor of Exception Class
      c)"throws" keyword used to handle "Checked Exceptions"
         "throw" keyword is used to throw exception whenever and whatever we want.

  **4)What is the difference between "final", "finally" and "finalize" keywords?

     */


public class E044 {
    public static void main(String[] args) throws IOException {// , add other
        FileInputStream fis1=new FileInputStream("src/day27Exception/File011.txt");// go and find the file
        int k=0;
        while ((k=fis1.read())!=-1){//read() method gives us asci value
            System.out.print((char) k);// explicit type casting
        }
        System.out.println("============");
        printAge(12);
        printAge(-12);//IllegalArgumentException
    }
//create a method which trows "IllegalArgumentException"
    public static void printAge (int age){
        if(age>=0){
            System.out.println(age);
        }else {
            throw new IllegalArgumentException("age can not be negative");
        }
    }

}
