package day11DoWhileLoop;

public class DoWhile01 {
    public static void main(String[] args) {
        //what is the difference between while and do while
        int i=1;
        while (i<1){
            System.out.println("hello");
            i++;
        }// sometimes we can get zero executions;
        // the code inside the body are not exuded
        // first check the condition, then executed the code


        //do-while
        //// first executed the code, then check the condition
        int k=1;
        do{
            System.out.println("hello");
            k++;

        }while (k<1);






    }
}
