package com.company.backtracking;

public class Ndigit {
    public static void main(String[] args) {

        int n=3;
        int index=0;
        String s="";
                getIndexElements(n,index, s);

    }

    private static void getIndexElements(int n, int index,String s) {
        if(index==n){
            System.out.println(s);
            return;
        }
        getIndexElements(n,index+1,s+"1");
        getIndexElements(n,index+1,s+"2");




    }
}
