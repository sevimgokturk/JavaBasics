package day28Abstriction2;

public class CalculaterRunner {
    public static void main(String[] args) {
        Calculator obj=new Profit();
        System.out.println(obj.addition(2,7));
        System.out.println(obj.multiplication(4,0));
        System.out.println(obj.division(4,0));
        System.out.println(obj.subtraction(7,9));
        System.out.println("=================");
        Calculator obj1=new Loss();
        System.out.println(obj1.addition(2,7));
        System.out.println(obj1.multiplication(4,0));
        System.out.println(obj1.division(4,2));
        System.out.println(obj1.subtraction(7,9));
        System.out.println(obj1.division(2,0));
    }

}
