package day12Constructor;

public class Review {
    public static class Araba{
        String markasi;
        String modeli;
        int yili;
        int fiyati;





        public  Araba(String markasi, String modeli, int yili, int fiyati){
            this.markasi=markasi;
            this.modeli=modeli;
            this.yili=yili;
            this.fiyati=fiyati;

        }



        public static void main(String[] args) {

            Araba a1 = new Araba("honda","c3",2009,6000);

        }









    }
}
