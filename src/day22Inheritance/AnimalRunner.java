package day22Inheritance;

public class AnimalRunner {
    /*
1) To make a class child of another class we use "extends" keyword
2) We create parent*-child relationship :
    a) To prevent repetition
    b) To make maintenance easy
    c) To make classes atomic
3) Child classes can use the methods of parent classes, but
parents can not use child class methods
 */
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.feedByMilk();
        dog1.bark();
        dog1.eat();
        dog1.drink();

        System.out.println("==============");

        Cat cat1= new Cat();
        dog1.feedByMilk();
        cat1.miouv();
        cat1.eat();
        cat1.drink();

        System.out.println("================");

        Bird bird1= new Bird();
        bird1.tweet();
        bird1.eat();
        bird1.drink();


        System.out.println("===============");
        Animals animal1= new Animals();
        animal1.drink();
        animal1.eat();


    }
}
