package day12Constructor;

public class Rewiev04 {
    public static int sCounter=0;
    public  int iCounter=0;
    public Rewiev04(){
        sCounter ++;
        iCounter++;

    }


    public static void main(String[] args) {
        Rewiev04 obj1= new Rewiev04();
        Rewiev04 obj2 = new Rewiev04();
        Rewiev04 obj3 = new Rewiev04();

        System.out.println("value of sCounter "+obj3.sCounter);
        System.out.println("value of iCounter "+obj3.iCounter);
        add(3,5);

    }
    public static int add(int a, int b){
       return a+b;
    }


}
