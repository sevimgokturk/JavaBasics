package day28Abstraction;

public class Sheep extends Animal{
    String sound;
    String name;

    public Sheep(String sound, String name) {
        this.sound = sound;
        this.name = name;
    }
    @Override
    public void animalSound() {
        System.out.println("Saund of animal is "+ sound);
    }

    @Override
    public void animalName() {
        System.out.println(" Name of animal is "+ name);

    }
}
