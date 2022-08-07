package interfaceManupulation;

public interface AirCondition  extends Vehicle {

    /*
    interface is not a class, it is Interface

    A class should be able to use multiple interfaces as parents

    In an interface most of the methods are abstract,
    but we can still use some concrete methods that are static and default

    we do not need to use abstract keywords for an Interface( forInterface name)

    if we use a variable in an interface we need to assinge a value

    In abstract class we can have constructors, but in Interface we cannot have constructors

    Interface  cannot have concrete method other than default and static,
    class can have concrete and abstract methods

    So in java when we use final variables the name of variables should be written in uppercase letters


     */

    String MAKE="Samsung";


    public abstract void electronicAc();

    public void claimedAC();

    void bacteriaKiller();

    void run();
    public default int power(){
        System.out.println("Hybrid engines are increasing their powers");
        return 1000;
    }

    public static String moodle(){
        System.out.println("The best model ever");
        return "the best";
    }

}
