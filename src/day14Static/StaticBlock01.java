package day14Static;

public class StaticBlock01 {
    //When you click on main method run button, Class Loader will be activated then it will load the class into the memory
    /*
        ...Sometimes we need some data just after the class loaded.
        For that kind of scenarios we use "static block".

        ...When you use static block it will be executed before
        "main method", "any other methods", "constructors",
        I mean it will be the first to execute

        Note: Static Block is used to initialize "static variables" when we want them before everything in the class

        Note: If you have multiple "static blocks" execution order will be from top to down
     */

    static  double pi;
    static double eNumber;
    public StaticBlock01(){
        System.out.println("cons");
    }

    static {
        System.out.println("static1");
        pi=3.14;

    }
    static {
        System.out.println("static2");
        eNumber=2.7;
    }

    public static void main(String[] args) {
        System.out.println("main");
        StaticBlock01 obj2 =new StaticBlock01();
        double r= 2;
        double area= pi*r*r;



    }
}
