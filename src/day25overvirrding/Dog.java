package day25overvirrding;

public class Dog extends Mammal{
    @Override
    public void eat() {
        System.out.println("dogs eat");
    }

    @Override
    public void drink() {
        System.out.println("dog drink");
    }

    public void bark(){
        System.out.println("dogs bark");
    }


}
