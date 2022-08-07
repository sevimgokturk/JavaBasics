package day25overvirrding;

public class Cat extends Mammal{
    @Override
    public void eat() {
        System.out.println("cats eat");
    }

    @Override
    public void drink() {
        System.out.println("cat drink");
    }

    public void meow(){
        System.out.println("cats meow");
    }
}
