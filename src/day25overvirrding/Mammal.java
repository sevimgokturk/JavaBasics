package day25overvirrding;

public class Mammal extends Animal{

   public void feed(){

       System.out.println("mammals feed");
   }

    @Override
    public Mammal myMethod() {

       return new Mammal();
    }
}
