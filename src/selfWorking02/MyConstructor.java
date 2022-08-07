package selfWorking02;

public class MyConstructor {
    // what is the output
    int x =5;
    MyConstructor(){
        System.out.println("non parametrise "+ x);
    }

    MyConstructor(int x){
        this();
        System.out.println("one parametrise "+ x);
    }

    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4);
        MyConstructor mc2= new MyConstructor();

    }

}
