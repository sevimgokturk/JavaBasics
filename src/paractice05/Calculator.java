package paractice05;

public class Calculator {

    public void add(double first, double second,double...number){
        double add=0;
      for (double w: number){
          add=add+w;
      }
        System.out.println(add);
    }


    public  void mutiply(double first, double second,double...number){

        double multiply=1;
        for (double w: number){
            multiply=multiply*w;
        }
        System.out.println(multiply);
    }


    public void subt(double first, double second){
           double subtruction=second-first;
        System.out.println(subtruction);


    }


    public  void divide(double first, double second){
        if(second==0){
            System.out.println("undefined");
        }else {
            double divide = first / second;
            System.out.println(divide);
        }

    }


}
