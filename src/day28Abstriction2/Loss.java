package day28Abstriction2;

public class Loss extends Calculator{
    @Override
    public int addition(int n1, int n2) {
        return -1;
    }

    @Override
    public int multiplication(int n1, int n2) {
        return -1;
    }

    @Override
    public int subtraction(int n1, int n2) {
        return n1-n2;
    }

    @Override

    public int division(int n1, int n2) {
        try {
        return n1/n2;

      }catch (ArrayIndexOutOfBoundsException e){
           return 1;
        }
    }
}
