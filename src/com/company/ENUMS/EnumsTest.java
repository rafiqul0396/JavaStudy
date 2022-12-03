package com.company.ENUMS;

public class EnumsTest {


    Color color=Color.PINK;

    public static void main(String[] args) {
        for(Color c:Color.values()){
            System.out.println(c);
        }
         //Color.BLACK.colorless=1000;
        System.out.println( Color.BLACK.colorless);
    }
}
