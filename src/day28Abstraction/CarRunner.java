package day28Abstraction;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Honda();
        car1.make();
        car1.model();
        car1.year();
       // inheritance _ polimorfisim_abstraction
        Car car2 = new Toyota();
        car2.make();
        car2.model();
        car2.year();





    }
}
