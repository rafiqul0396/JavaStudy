package com.company.Gnerrics.variance;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {

        // arrays are covariance in means an array of type S[] is a subtype of T[] if S is a subtype of T
        Integer[] arr= new Integer[3];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;

        Number[] obj=arr;


        // arrays are refied - such as arrays are checks at run time

        Object[] arr2= new Integer[2];
        //arr2[0]=2.3f;

        //generics are invariants -- that means u can't not store subtypes s[] in type t[] ,compile time error
        List<Integer> ist= new ArrayList<>();
        ist.add(10);
        //List<Number> my= ist;


        // covariance -- is enable generics to read a subtypes
        // covariance -- accepts the subtypings

        //List<? extends  Number>myobj=new ArrayList<Float>(java.util.Arrays.asList(1.5f,1.2f,1.34f));
        //Number m= myobj.get(0);

        // it allowed becuse compiler bit confused which types of data it is
        //
       // myobj.add(1.2f);


        // contravriants -- is the relations in opposites directions of covariance
        // super Number accepts supertype  so it is refers to contra-variance
        // contravriances : accepts the superTypes

        List<? super  Number> lt = new ArrayList<Object>();
        lt.add(3.0f);
        lt.get(0);
        lt.add(obj[0]);
        System.out.println(lt.toString());


    }
}
