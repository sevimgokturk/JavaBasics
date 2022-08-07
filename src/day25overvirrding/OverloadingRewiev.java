package day25overvirrding;

public class OverloadingRewiev {

    public static void main(String[] args) {

    }
    // can we overload static? yes
    public static void add(int i, int j){
        System.out.println(i+j);
    }
    public static void add(int i, int j,int k){
        System.out.println(i+j+k);
    }
    // can we overload final? yes
    public final void multiply (int a, int b){
        System.out.println(a*b);
    }
    public final void multiply (int a, int b, int c){
        System.out.println(a*b*c);
    }
    // can we overload private? yes
    private void join(String s,String m){
        System.out.println(s+m);
    }
    private void join(String s,String m,String c){
        System.out.println(s+m+c);
    }
}
