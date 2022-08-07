package paractice05;

public class Q07 {
    public static void main(String[] args) {
        method(1,2,3,4,5,6,7);
        method(8,2);

    }

    public static void method(int first,int...elements){
        int sum=0;
        for (int w:elements){
            sum=sum+w;
        }
        int result=first*sum;
        System.out.println(result);

    }
}
