package selfworking04;

public class Car1 extends Motorized1 {
    public Car1(String make){
        System.out.println("motorized cons");
    }
    public Car1(int capacity) {
        super(capacity);
    }
}
