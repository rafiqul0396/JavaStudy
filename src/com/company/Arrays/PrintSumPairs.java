package com.company.Arrays;

import java.util.*;

public class PrintSumPairs {
    public static void main(String[] args) {
        int []arr={3, 4, 7, 1, 2, 9, 8,45};
        Equals(arr);
    }
    public static void Equals(int[] a){
        ArrayList<ArrayList<Integer>>res= new ArrayList<ArrayList<Integer>>();
        HashMap<Integer,List<Pair>> map = new  HashMap<Integer,List<Pair>> ();
        List<Pair> list;
        for(int i=0; i< a.length; i++){
            for(int j=i+1; j<a.length; j++){
                list = map.get(a[i]+a[j]);
                if(list==null){
                    list = new ArrayList<Pair>();
                }
                list.add(new Pair(i, j));
                map.put(a[i]+a[j],list);
            }
        }

        for (Integer key : map.keySet()) {
            list = map.get(key);
            //ArrayList<Integer> temp=new ArrayList<Integer>();
            if ( list.size()>1){
                for (int i = 0; i < list.size() - 1; i++) {
                    if (!Objects.equals(list.get(i).x, list.get(i + 1).x) && !Objects.equals(list.get(i).y, list.get(i + 1).y)
                            && !Objects.equals(list.get(i).x, list.get(i + 1).y)
                            && !Objects.equals(list.get(i).y, list.get(i + 1).x)) {
                        ArrayList<Integer> temp=new ArrayList<Integer>();

                        temp.add(a[list.get(i).x]);
                        temp.add(a[list.get(i).y]);
                        temp.add(a[list.get(i+1).x]);
                        temp.add(a[list.get(i+1).y]);
                        res.add(temp);
                        System.out.println(a[list.get(i).x] + "+" + a[list.get(i).y] + " = " +
                                a[list.get(i + 1).x] + "+" + a[list.get(i + 1).y]);
                    }
                }


            }
        }
        //Collections.sort(res);
        System.out.println(String.valueOf(res));

    }

    static class Pair {
        Integer x;
        Integer y;

        Pair(Integer a, Integer b) {
            x = a;
            y = b;
        }
    }
}
