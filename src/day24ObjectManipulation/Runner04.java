package day24ObjectManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner04 {
    /*
 Create 3 person object
 Then create a method to concatenate the names with lastnames and add also "@gmail.com"
 Finally print them on the console
  */
    public static void main(String[] args) {
        Person person1 = new Person("Sevim", "Gokturk");
        Person person2 = new Person("nil", "Betul");
        Person person3 = new Person("idil", "naz");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(getemail(personList));
    }
    public static List<String> getemail(List<Person> personList ){
        List<String> emailList=new ArrayList<>();
        for (Person w: personList){
            emailList.add((w.name+ w.lastname+"@gmail.com").replaceAll(" ","").toLowerCase());
        }
        return emailList;
    }
}


