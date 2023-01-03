package com.company.DesignPattern.AdaptorPattern.IteratorAndEnumeration;

public class EnumerationApi implements  Enumeration{
    @Override
    public void hasMoreElements() {
        System.out.println("this is hasnextmethod");
    }

    @Override
    public void nextElement() {
        System.out.println("this next nmethod");

    }
}
