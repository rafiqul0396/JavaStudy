package com.company.String;

import java.util.Scanner;

public class ChangeCaseCharter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.next();
       // char[] a = s.toCharArray();
        System.out.println("Enter the character you are looking for");
        System.out.println(s);
        //String c = scanner.next();
        //char d = c.charAt(0);
        String res="";
        for (int i = 0; i <s.length(); i++) {
            char d=s.charAt(i);
                if (d >= 'a' && d <= 'z') {
                    d -= 32;
                    res+=d;


                }
                else if (d >= 'A' && d <= 'Z') {
                    d += 32;
                    res+=d;
                }

            }

        s = String.valueOf(res);
        System.out.println(s);

    }
}
