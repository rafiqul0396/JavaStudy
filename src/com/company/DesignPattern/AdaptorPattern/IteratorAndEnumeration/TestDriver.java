package com.company.DesignPattern.AdaptorPattern.IteratorAndEnumeration;

import com.company.DesignPattern.AdaptorPattern.Duck;

public class TestDriver {
    public static void main(String[] args) {
        EnumerationApi api=  new EnumerationApi();
        Iterator  itr=new EnumerationIterator(api);
        itr.hasNext();
    }



}
