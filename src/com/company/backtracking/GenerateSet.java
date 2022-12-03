package com.company.backtracking;

import java.util.HashSet;

public class GenerateSet {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int n=3;
        int index=0;
        HashSet<Integer>set=new HashSet<Integer>();
        genenerate(arr,n,index,set);
    }

    private static void genenerate(int[] arr, int n,int index, HashSet<Integer> set) {
        if(index==n){
            System.out.println(set);
            return;
        }
        for (int j : arr) {
            set.add(j);
            genenerate(arr, n, index, set);
            set.remove(arr[index]);
        }



    }
}
