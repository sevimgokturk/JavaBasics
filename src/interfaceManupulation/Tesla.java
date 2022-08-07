package interfaceManupulation;

public class Tesla extends ElecticalVehicles  {
    @Override
    public void claimedAC() {
        System.out.println("the tesla ac presents");
    }

    @Override
    public void run() {
        System.out.println("tesla runs performance");

    }

    @Override
    public void moveSmooth() {

    }
}
