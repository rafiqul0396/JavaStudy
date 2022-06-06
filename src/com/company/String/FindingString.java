package com.company.String;

import java.util.Scanner;

public class FindingString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(str);
        String str1=sc.nextLine();
        String []s=str1.split(" ");
        System.out.println(str1);
        //String st=sc.next();
        //System.out.println(st);
        int count=0;
        boolean b=true;
        for(int i=0;i<s.length;i++){
            b=str.contains(s[i]);
            if(b==true) {
                count++;
            }

        }
        //boolean b=str.contains(str1);
        System.out.println(count);



    }
}
