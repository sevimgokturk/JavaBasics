package day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        //Find the smallest positive integer
        // and greatest negative integer in a given integer list
        List <Integer> list=new ArrayList<>();
        list.add(9);
        list.add(7);
        list.add(3);
        list.add(-1);
        list.add(-10);
        Collections.sort(list) ;
        System.out.println(list);
        for(int w: list){
            if(w>0) {
                System.out.println(w);
                break;
            }
            }
        Collections.reverse(list);
        for (int w: list){

            if(w<0){
                System.out.println(w);
                break;
            }
        }

            }
        }






