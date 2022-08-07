package day25overvirrding;
/*
    1)Encapsulation means data hiding
    2) How to hide data?
        i) I make the data private
    3) can you read encapsulated data to other classes?
    yes I create "getter method (Java Bean)" for the encapsulation data then by using getter method
    I can read it
    4) can you update encapsulation data from the other classes?
        Answer:  yes I create "getter method (Java Bean)" for the encapsulation data then by using getter method
                 I can read it
      5)return typ of getter() method must be same with the data type of the variables
            return type of setter() method will be void every time
       6) getter method don't use any method but setter method use a single parameters whose date same with the data type of the variables
       7) getter method for boolean start wit is doesn't start with get.
       8) if you don't want to make your variable value readable : what should you do?
       answer: don't create getter
       8) if you don't want to make your variable value update : what should you do?
       answer: don't create setter
        8) if you don't want to make your variable value neither readable nor updatable : what should you do?
       answer: don't create setter, don't create getter
       Not: if you don't create  any setter for any variable, the class is called "immutable class"

 */

public class CreditCart {
    private String ccn="1234567890098765432";
    private  int age =21;
    private  boolean isExpired=false;
//by using getter method we can read the value of the encapsulation data from other classes
    public String getCcn() {
        return ccn;
    }
// by using setter methods we can update the value of encapsulated data from other classes
    public void setCcn(String ccn) {
        this.ccn = ccn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}

