package day17MultiDimentionalArrayList;

import java.util.ArrayList;
import java.util.List;

public class bb {
    public static void main(String[] args) {

        List<String>al5=new ArrayList<String>();
        al5.add("a");
        al5.add("aa");
        al5.add("aaa");
        al5.add("aaaa");
        al5.add("aaaaa");
        al5.remove("aa");
        for (int i=0;i<al5.size();i++){
            if (al5.get(i).length()<5){
                al5.remove(i);
            }
        }
        System.out.println(al5);
    }}
