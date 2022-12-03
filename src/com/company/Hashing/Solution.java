package com.company.Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> map1= new HashSet<>();
        HashSet<Integer> map2= new HashSet<>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();


        for(int x:nums1){
            map1.add(x);
        }
        for(int y:nums2){
            map2.add(y);
        }
        ArrayList<Integer>temp1=new ArrayList<Integer>();
        for(Integer i:map1){
            if(map2.contains(i)){
                temp1.add(i);

            }
        }
        lists.add(temp1);
        ArrayList<Integer>temp21=new ArrayList<>();
        for(Integer j:map2){
            if(map1.contains(j)){
                temp21.add(j);

            }
        }
        lists.add(temp21);



        return lists;




        
    }

    public static void main(String[] args) {
        int []arr={1,2,3};
        int []arr2={2,4,6};
        System.out.println(findDifference(arr,arr2));

    }
}