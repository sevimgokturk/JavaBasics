package day23Inheritance;

public class Practice01 {
    int a=12;
    public void rest(){
        System.out.println("XXX");
    }
    public Practice01(){
        System.out.println("A");
    }
    public Practice01(int a){
        this();
        System.out.println("B");
    }

}
class Practice02 extends Practice01{
    int a=13;
    public void rest(){
        System.out.println("YYY");
    }
    public Practice02  (){
        super(8);
        System.out.println("C");
    }
    public Practice02(int a){

        System.out.println("E");
    }

}
class Practice03 extends Practice02{
    int a =14;
    public void rest(){
        System.out.println("ZZZ");
    }
    public Practice03(String s){
        super();
        System.out.println("D");
    }

}
class Runner{
    public static void main(String[] args) {



        Practice03 practice03=new Practice03("Woow!");
        System.out.println(practice03.a);
        practice03.rest();//ZZZ
        Practice02 practice02= new Practice03("Wooow!");
        System.out.println(practice02.a);
        practice02.rest();//ZZZ
        Practice01 practice01= new Practice03("Wooow!");
        System.out.println(practice01.a);
        practice01.rest();//ZZZ
        Object obj=new Practice03("Woow!");

    }
}
