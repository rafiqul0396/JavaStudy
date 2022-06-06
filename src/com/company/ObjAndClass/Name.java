package com.company.ObjAndClass;

public class Name {
    public void getName(String Fist) {
        System.out.println("my name is"+Fist);
    }
    public  int  getName(int first,int second){
        System.out.println(first+second);
        return first+second;
    }

    public static void main(String[] args) {
        Name name = new Name();
        name.getName("Rafik");
        System.out.println(name.getName(2,3));

    }


}
