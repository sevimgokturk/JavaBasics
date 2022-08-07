package selfWorking02;

import java.util.ArrayList;

public class ScoractiveHowRemoveWork {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.remove("v"));
        System.out.println(list.remove("C"));
        System.out.println(list.remove(0));
        System.out.println(list);

    }
}
