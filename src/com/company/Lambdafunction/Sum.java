package com.company.Lambdafunction;

interface  sum{
    void sum1();
    int sum2(int a, int b);
}

public class Sum implements sum {
    @Override
    public int sum2(int a,int b) {
        return a+b;
    }

    public static void main(String[] args) {
        sum s=new Sum();
        s.sum2(2,3);
        s.sum1();

    }

    @Override
    public void sum1() {
        System.out.println("Hello world");
    }
}
