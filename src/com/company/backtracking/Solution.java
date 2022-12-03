package com.company.backtracking;

import java.util.HashSet;

class Solution {

    static boolean  recursion(String s, HashSet<String> set, int pos){
        if(pos==s.length()){
            return true;
        }
        
        for(int i=pos;i<s.length();i++){
            
            System.out.println(s.substring(pos,i+1));
            if(set.contains(s.substring(pos,i+1)) && recursion(s,set,i+1)){
                
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("leet");
        set.add("code");

        String s="leetcode";
        boolean b=recursion(s,set,0);
        System.out.println(b);

    }
}