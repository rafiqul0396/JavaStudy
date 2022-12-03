package com.company.constructorStudy;

public class Caller {
    public static void main(String[] args) {
        Students s=new Students("rafik",23,"malda");
        Students s1=new Students("akask",23,"malda");
        Students s2=new Students("sarwar",23,"malda");
        Students s3=new Students("rehan",23,"malda");
        Students s4=new Students("tomcat",23,"malda");

        System.out.println(s1.getCount());
    }
}
