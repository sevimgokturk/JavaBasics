package day25overvirrding;

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("birds eat");
    }

    @Override
    public void drink() {
        System.out.println("birds drink");
    }

    public void tweet(){
        System.out.println("birds tweet");
    }
}
