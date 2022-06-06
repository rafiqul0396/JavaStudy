package com.company.Collections;

import java.util.*;

public class RemoveFromList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println (fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        for (String fruit : fruits) {
            System.out.println(fruit);
            if ("Apple".equals(fruit)) {
                fruits.remove(fruit);
            }
        }
        Iterator<String> fruitIterator = fruits.iterator();
        fruits.set(0, "Watermelon");
        while(fruitIterator.hasNext()){
            System.out.println(fruitIterator.next());
        }
        /*Iterator<String> fruitIterator1 = fruits.iterator();
        fruits.add("Watermelon");
        while(fruitIterator1.hasNext()){
            System.out.println(fruitIterator1.next()); //ConcurrentModificationException here
        }

         */

        for (int i = (fruits.size() - 1); i >=0; i--) {
            System.out.println (fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }
        List<String> data = Arrays.asList("ab", "bc", "cd", "ab", "bc", "cd");
        List<String> list = new ArrayList<>(data); // will add data as is
        Set<String> set1 = new HashSet<>(data); // will add data keeping only unique values

        List<String> aListOfFruits = new ArrayList<>();
        aListOfFruits.add("Melon");
        aListOfFruits.add("Strawberry");
        System.out.println(aListOfFruits);
        List<String> aListOfFruitsAndVeggies = new ArrayList<String>();
        aListOfFruitsAndVeggies.add("Onion");
        aListOfFruitsAndVeggies.addAll(aListOfFruits);
        System.out.println(aListOfFruitsAndVeggies);
        List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"));
        names.forEach(System.out::println);
        names.parallelStream().forEach(System.out::println);

        //Creates ListIterator which supports both forward as well as backward traversel
        ListIterator<String> listIterator = names.listIterator();
//Iterates list in forward direction
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
//Iterates list in backward direction once reaches the last element from above iterator in forward
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        Map<Integer, String> names2 = new HashMap<>();
        names2.put(1, "Clementine");
        names2.put(2, "Duran");
        names2.put(3, "Mike");
        names2.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

        for (Integer key : names2.keySet()) {
            System.out.println(key);
        }
        for (String key : names2.values()) {
            System.out.println(key);
        }

        List<String> list1 = new ArrayList<String>();
        //List<String> list2 = new ArrayList<String>();
        list1.add("Hello1");
        list1.add("Hello2");
        System.out.println("Before Sublist "+list1);
        List<String> list3 = list1.subList(0, 1);
        list3.add("Hello3");
        System.out.println("After sublist changes "+list1);
    }
}
