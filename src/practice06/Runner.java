package practice06;

public class Runner {
    public static void main(String[] args) {

      Circle circle1=new Circle(2);
        System.out.println("circle radius: "+ circle1.getRadius());
        System.out.println("circle area: "+ circle1.getArea());



        Circle circle2=new Circle(-2);
        System.out.println("circle radius: "+ circle2.getRadius());
        System.out.println("circle area: "+ circle2.getArea());

        Cylinder cylinder1=new Cylinder(2,4);
        System.out.println("H: "+cylinder1.getHeight());
        System.out.println("volume:"+cylinder1.getVolume());

        Cylinder cylinder2=new Cylinder(2,-1);
        System.out.println("R: "+ cylinder2.getRadius());
        System.out.println("H: "+cylinder2.getHeight());
        System.out.println("volume:"+cylinder2.getVolume());

        Cylinder cylinder3=new Cylinder(-2,-7);
        System.out.println("R: "+ cylinder3.getRadius());
        System.out.println("H: "+cylinder3.getHeight());
        System.out.println("volume:"+cylinder3.getVolume());



    }
}
