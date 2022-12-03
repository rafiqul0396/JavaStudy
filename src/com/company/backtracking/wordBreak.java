package com.company.backtracking;

import java.util.Arrays;
import java.util.HashSet;

public class wordBreak {

    static int  recursion(String s, HashSet<String> set, int pos, int[] dp){
        //int []dp=int [s.length()+1];
        if(pos==s.length()){
            return 1;
        }

        if(dp[pos]!=-1){
            return dp[pos];
        }

        for(int i=pos;i<s.length();i++) {

            // System.out.println(s.substring(dp[i]));


            if (set.contains(s.substring(pos, i + 1)) && (recursion(s, set, i + 1, dp) == 1)) {


                dp[i] = 1;
                return dp[i];

            }




        }
        dp[pos] = 0;
        return dp[pos];


    }

    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("A");
        set.add("AB");
        set.add("S");


        //["go","goal","goals","special"]

        String s="ABS";
        int   []dp=new int[s.length()];
        Arrays.fill(dp, -1);
        boolean b=recursion(s,set,0,dp)==1;
        System.out.println(b);











    }

}
