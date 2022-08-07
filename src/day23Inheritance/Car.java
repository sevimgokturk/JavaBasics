package day23Inheritance;

public class Car extends Motorized{
    public Car(String make){
        super(16);
        System.out.println("car cons with String para");
    }
    public Car(int price){
        super(20);
        System.out.println("car cons with int paramet");
    }
}
