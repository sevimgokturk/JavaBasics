package day25overvirrding;
   /*
        1)Access modifier of the "Overriding Method"(The method inside the child class) CANNOT be narrower(can be same or wider)
          than the access modifier of the "Overridden Method"(The method inside the parent class)
          "Overridden Method"       "Overriding Method"
               public                    public
               protected                 protected - public
           *** private                   private methods cannot be overridden
           *** default                   default - protected - public (If you are not in the same package default methods cannot be overridden)

         2)Return Types must have "IS-A" Relationship from "Overriding Method"(child) to "Overridden Method"(parent)
           Note: To have "IS-A" relationship we must have "parent - child" relationship.
                 If Java or you did not create "parent - child" relationship between the classes you cannot have "IS-A" relationship, therefore
                 you cannot use different return types in overriding
           Note: Java did not create "parent - child" relationship between "wrapper classes" because of that if return type is one of the wrapper class
                 return type of "overriding method" must be same with the return type of the "Overridden Method"
           Note: If the return type is "primitive", you cannot change the return type in overriding
           Note: If the return type is "void", you cannot change the return type in overriding

         3) You cannot update "method name" and "method parameters" in overriding under any condition.
            Note: "method name" and "method parameters" are the "signature of the method"(method signature).
                  If you change anyone of "method name" and "method parameters", it means you created a new method but in overriding
                  we should not create a new method we should just change the implementation.

         4) "static methods" are common for all objects, if you override and change the implementation all other objects will be affected from the update but
            that can create many issues because of that Java does not let to override static methods.

         5) "final methods" body is the last updated body, you cannot change the body.
            But we change the body in overriding, this is contradiction because of that
            Java does not let to override "final methods"
            6) what is the difference between method overloading and overriding
            method overloading is done in a single class but method overriding needs inheritance
            in method overloading we change the method signature, but method overriding dont touch
            private static final cannot override but overloading
            method overloading(static polymorphism) + method overriding(dynamic polymorphism) =polymorphism

     */

public class Animal {
    public void eat(){
        System.out.println("animals eat");
    }
    public  void drink(){
        System.out.println("animals drink");
    }
    public Animal myMethod(){
        return new Animal();
    }

}
