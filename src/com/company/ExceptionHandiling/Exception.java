package com.company.ExceptionHandiling;


class Hi{
    public void show(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            //try{Thread.sleep(1000);}catch(Exception e){}

        }
    }
}
class Hello{
    public void show(){
        for(int i=0;i<5;i++) {
            System.out.println("hello");
        }
    }
}



public class Exception extends Thread {
     public void run() {
         System.out.println("this is working");
     }

    public static void main(String[] args) {

        Hi obj1= new Hi();
        Hello obj2= new Hello();
        Exception t1= new Exception();
       t1.start();


    }
}
