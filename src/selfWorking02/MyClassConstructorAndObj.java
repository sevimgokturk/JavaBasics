package selfWorking02;

public class MyClassConstructorAndObj {
    // what is the output
    int x =3;
    int y=5;
    MyClassConstructorAndObj(){
        x+=1;
        System.out.println("-x non parametrise "+ x);
    }
    MyClassConstructorAndObj(int i){
        this();
        this.y =i;
        x+=y;
        System.out.println("-x ony one parameter "+ x);
    }
    MyClassConstructorAndObj(int i, int i2){
        this(3);
        this.x -=4;
        System.out.println("-x two parameter "+ x);
    }

    public static void main(String[] args) {
        MyClassConstructorAndObj mc1 = new MyClassConstructorAndObj(4,3);
    }









}
