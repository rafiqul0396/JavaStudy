package com.company.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);

        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);


        //loops we are using here are
        //1. for loop normal
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("after this for loops we have Iterator in the loop");
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        List<Integer> numbersA = new ArrayList<>();
        List<Integer> numbersB = new ArrayList<>();
        numbersA.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 7, 5, 2 }));
        numbersB.addAll(Arrays.asList(new Integer[] { 13, 32, 533, 3, 4, 2 }));
        System.out.println("A: " + numbersA);
        System.out.println("B: " + numbersB);
        List<Integer> numbersC = new ArrayList<>();
        numbersC.addAll(numbersA);
        numbersC.retainAll(numbersB);
        System.out.println("List A : " + numbersA);
        System.out.println("List B : " + numbersB);
        System.out.println("Common elements between A and B: " + numbersC);


    }
}
