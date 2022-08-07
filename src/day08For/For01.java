package day08For;

public class For01 {
    public static void main(String[] args) {

        String h="hello ";
        System.out.println(h.repeat(5));

        System.out.println("==============");

        //     Start     condition     method
        for(int i=1   ;    i<=5;        i+=1){
            System.out.println("Hello!");

        }

        System.out.println("================");

        //


        for(int i=11   ;    i<45;        i+=1) {
            System.out.print(i+", ");
        }

        System.out.println("========================");
        //

        for(int i=11   ;    i<45;        i+=1) {
            if(i%2==0){
            System.out.print(i+", ");
        }}


        for (int i=68; i>12; i-=1 ){
            if(i%2!=0){
                System.out.print(i+ " ");
            }
        }

        for (int i=120; i>10; i-=1 ){
            if(i%4==0 && i%6==0){
                System.out.print(i+ " ");
            }
        }







    }
}
