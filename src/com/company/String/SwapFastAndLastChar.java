package com.company.String;

public class SwapFastAndLastChar {
    public static void main(String[] args) {
        String s="Hello World How you";
        System.out.println(s);
        String str=changeFirstAndLastCharINword(s);
        System.out.println(str);
    }

    private static String changeFirstAndLastCharINword(String s) {
        char[] chararray=s.toCharArray();
       for(int i=0;i<chararray.length;i++){
           int k=i;
           while(i<chararray.length && chararray[i]!=' '){
               i++;


           }
           int x=i;
           while(k<x) {
               //swapping the char in the ahar array
               char temp = chararray[x - 1];
               chararray[x - 1] = chararray[k];
               chararray[k] = temp;
               k++;
               x--;
           }

       }
       return new String(chararray);
    }
}
