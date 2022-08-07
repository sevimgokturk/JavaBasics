package selfworking03;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.eat();
        obj1.drink();
        obj1.bark();
        obj1.feedByMilk();

        System.out.println("=============");

        Bird obj2 =new Bird();
        obj2.eat();
        obj2.drink();
        obj2.tweet();

        System.out.println("=============");

        Cat obj3 =new Cat();
        obj3.eat();
        obj3.drink();
        obj3.meoaw();
        obj3.feedByMilk();



    }



}
