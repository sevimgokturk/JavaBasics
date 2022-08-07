package interfaceManupulation;

public class Car implements AirCondition,HybridEngine{
    @Override
    public void electronicAc() {
        System.out.println("the car ac electronic");
    }

    @Override
    public void claimedAC() {
        System.out.println("the car ac is claimed ac");

    }

    @Override
    public void bacteriaKiller() {
        System.out.println("the car ac kills 99% of the bacterias");

    }

    @Override
    public void run() {
        System.out.println(" the car ac runs perfectly");

    }


    @Override
    public void havingHybridEngine() {
        System.out.println("the car engine is hybrid");

    }

    @Override
    public void moveSmooth() {

    }
}
