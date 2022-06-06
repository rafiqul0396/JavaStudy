package com.company.sorting;

import java.util.*;

public class NewArrayClass {
    public static List<Integer> sortBasedOnFrequencyAndIndex(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : list) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        list.sort((n1, n2) -> {
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }

            return list.indexOf(n1) - list.indexOf(n2);
        });

        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 7, 10, 11, 10, 7, 6, 5};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(NewArrayClass.sortBasedOnFrequencyAndIndex(list));

    }
}
