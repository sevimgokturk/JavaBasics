package day26Exception;

public class E01 {

     /*
     1) exceptions means unexcepted issues in your codes like gass finising in your vocation.
     2) ther ar two ways to work with Exceptions
     fires exceptions handling==> try catch bolcks
     second trow exception // getting help from someone
      */

    public static void main(String[] args) {
        divide(12,4);
        divide(0, 5);
        divide(12,0);//no answer in Math. java gives exception
                    //Could not divisible ==> / by zero

    }
    /*
    1) if you think any problem can occur for any line of code put inside the try block and create a catch block
    2) inside the catch parenthesis put possible exceptions class.
    3) by using e.getMessage() you can get the technical message
    4) if you want to put a not technical message inside the catch body
    5) if the codes inside the try body works without any issue, catch block will not be executed
    ****6) after any exception occurred next line of code can not be executed.JAVA STOPS EXECUTION.
     */

    public static void divide(int a, int b){
        try{
            System.out.println(a/b);
            System.out.println("HIII");
            System.out.println("BYE");
            System.out.println("============");

        }catch (ArithmeticException e){// data type ArithmeticException, e= variable's name
            System.out.println("Coud not divisible ==> "+e.getMessage());
        }
        //not: following  code is not recommended because it needs math knowledge
      /*  if(b==0){
            System.out.println("b cannot be 0");
        }else {
            System.out.println(a/b);
        }*/


    }


}
