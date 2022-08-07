package day19TestByValueDayTimeClases;

public class PassByValue {
    /*
   1)When you use a variable inside method, Java creates a copy of the variable and uses the copy inside the method.
   Because Java wants to protect the original value of variable.
   This process called as "Pass By Value" in Java.

   2)Java uses Pass By Value all the time

   3) The opposite of "Pass By Value" is "Pass By Reference", Java does not use "Pass By Reference"
   The programming languages use pass by reference does not protect the original value.

    */
    public static void main(String[] args) {
        int shirt=100;
        System.out.println(veteransDiscount(shirt)+" for veterans");
        System.out.println(studentDiscount(shirt)+" for students");
        System.out.println(senieurDiscount(shirt)+" for senior");

    }
    public static int veteransDiscount(int shirt){
        return shirt-20;
    }
    public static int senieurDiscount(int shirt) {
        return shirt - 10;
    }
    public static int studentDiscount(int shirt) {
        return shirt - 5;
    }

}

