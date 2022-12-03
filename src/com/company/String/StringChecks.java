package com.company.String;

public class StringChecks {

    public static void main(String[] args) {
        String firstString = "Test123";
        String secondString = "Test" + 123;
        if (firstString.equals(secondString)) {
            System.out.printf("this is equal");
            // Both Strings have the same content.
        }else {
            System.out.printf("this is unequal");
        }
        System.out.println("");

        //compare string using switch case
        String stringToSwitch = "A";
        switch (stringToSwitch) {
            case "a":
                System.out.println("a");
                break;
            case "A":
                System.out.println("A"); //the code goes here
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                break;
        }
        // constant value put on the left side of equal function
        String foo="";
       boolean b= "baz".equals(foo);
        System.out.println(b);
        //constant value put on right side of equal
        boolean c=foo.equals("baz");
        System.out.println(c);

        // compare to string
        String str1=new String("hello");
        String str2="hello";
        if(str1.equals(str2)){
            System.out.println("this is equal");
        }

        // upper and lower case in java
        String string = "This is a Random String";
        String upper = string.toUpperCase();
        String lower = string.toLowerCase();
        System.out.println(string); // prints "This is a Random String"
        System.out.println(lower); // prints "this is a random string"
        System.out.println(upper); // prints "THIS IS A RANDOM STRING"


    }
}
