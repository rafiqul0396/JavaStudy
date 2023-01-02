package com.company.DesignPattern.AdaptorPattern.IteratorAndEnumeration;

public class EnumerationIterator implements Iterator{
    public  Enumeration enumeration;

    public  EnumerationIterator(Enumeration enumeration){
        this.enumeration=enumeration;

    }
    @Override
    public void hasNext() {
        enumeration.hasMoreElements();

    }

    @Override
    public void next() {
        enumeration.nextElement();

    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("this is invalid");

    }
}
