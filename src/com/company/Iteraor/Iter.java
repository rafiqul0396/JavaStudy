package com.company.Iteraor;

import java.util.*;

public class Iter {
    public static void main(String[] args) {
        List<String> newlist = new ArrayList<>();
        newlist.add("one");
        newlist.add("two");
        newlist.add("three");

        Iterator<String> iterator = newlist.iterator();


        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        Iterator<String> iterator2 = set.iterator();


        //Iterator iterator = newlist.iterator();

        while(iterator.hasNext()) {
            Object nextObject = iterator.next();
            System.out.println(nextObject);

        }

        List<String> list = new ArrayList<>();

        list.add("123");
        list.add("456");
        list.add("789");

        Iterator<String> iterator1 = list.iterator();

        while(iterator1.hasNext()) {
            String value = iterator1.next();

            if(value.equals("456")){
                list.add("999");
            }
        }

    }
}
