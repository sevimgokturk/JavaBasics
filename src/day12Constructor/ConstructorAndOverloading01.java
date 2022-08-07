package day12Constructor;

public class ConstructorAndOverloading01 {

 public static class Car{
     /*
        1)Constructors are used to create object from a class
        2)Java puts default constructors inside every class
        3)Default constructors does not have any parameters
          inside the constructor parenthesis
        4)Constructor names must match with the class names
        5)In a class we can have multiple constructors

        How to create a constructor?
        1)Type access modifier
        2)TYpe the class name as constructor name
        3)Open-close parenthesis
        4)Open curly brace press enter

       **** What are the differences between "constructors" and "methods"?****
        1)Constructors do not have return type but methods must have
        2)Constructor names must be same with the class name
        because of that you cannot decide constructor names
          but method names can be assigned by developer.


      */
     String marke;
     String model;
     double price;
     int year;

    // if we create any constructor java delete default one which is invisible
     public  Car(){

     }
     public Car(String marke, String model, double price, int year){
         this.marke=marke;
         this.model=model;
         this.price=price;
         this.year=year;

     }
     public Car(String marke,String model){
         this.marke=model;
         this.model=model;

     }

     public static void main(String[] args) {

         Car   c1    =    new     Car();
         c1.marke="Honda";
         c1.model="civic";
         c1.price=10000;
         c1.year= 2016;

         Car c2     = new Car();
         c1.marke = "mercedes";
         c2.model = "s2";
         c2.price =30000;
         c2.year=2019;

         Car c3 = new Car("BMV","M3",70000,2021);
         Car c4 = new Car("volvo","v60",10000,2000);
         Car c5 = new Car("tofas","modeli");


     }
     public String run(){ // bu method
         return "i started to run";
     }


 }

}
