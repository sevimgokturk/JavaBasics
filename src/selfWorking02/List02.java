package selfWorking02;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {
    public static void main(String[] args) {
          /*
        Ask user to enter a name
	 	If the letter exists in the list convert it to "Got it"
	 	otherwise, add the element user entered into the list
     */
        Scanner scan=  new Scanner(System.in);
        System.out.println(" enter a name: ");
        String name= scan.next();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sevim");
        list.add("Osman");
        list.add("Nil");
        list.add("Idilnaz");
        list.add("Yagmur");
        for (int i=0; i<list.size(); i++){
            if (list.contains(name)){
                System.out.println("Got it!");
            }else {
                list.add(name);
                System.out.println(list);
            }
            break;
        }


    }
}
