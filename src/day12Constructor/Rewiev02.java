package day12Constructor;

public class Rewiev02 {
    public static class  Araba{

        String marka;
        String model;
        int yil;
        int fiyat;



        public static void main(String[] args) {
            Araba a1= new Araba();
            a1.marka="Honda";
            a1.model="cd";
            a1.yil=2009;
            a1.fiyat=6000;

        }
        public Araba (){}
        public String run(){
            return "i started to run";
        }










    }
}
