package interfaceManupulation;

public abstract class ElecticalVehicles implements AirCondition{


    /*
    abstract class can have abstarct methods and non abstract methods sa we can override and
     */
    @Override
    public  void electronicAc(){
        System.out.println("electrical vehicle Ac.");
    }


    @Override
    public void bacteriaKiller(){
        System.out.println("electrical vehicle bacteria killers");
    }



}
