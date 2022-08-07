package day13StaticKeywordsAndVariablesType;

public class Static01 {
    //static attacig the class

    public static int sCounter1 = 0; // static(class) variable
    public int iCounter1 = 0;// instant(object) variables

    // for create a object we need to create a constructor
    public Static01(){
        iCounter1++;
        sCounter1 ++;

    }

    public static void main(String[] args) {
        Static01 obj1 = new Static01(); //object
        Static01 obj2 = new Static01(); // object
        Static01 obj3 = new Static01(); // object

        System.out.println("the value of sCounter:  "+ sCounter1);
        System.out.println("the value of iCounter:  "+obj3.iCounter1);

        System.out.println("the value of sCounter:  "+ sCounter1);
        System.out.println("the value of iCounter:  "+obj2.iCounter1);
        int age=13;// if we creeat a variable inside the methode its local veriable
        System.out.println(age);
// normaly java assigne a value but
// if it is a local variable java do not
        // if we want to use it we must asigne a value
        // local variables can not be outside the methode





    }
    public static int add( int a, int b){
        int c =2;//local
        return a+b;

    }




}
