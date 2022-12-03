package com.company.OS.AdderSubtractor;

public class Adder implements  Runnable{
    public Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        //1 incremnt the count value
        for(int i=0;i<100;i++){
            count.value+=1;

        }

    }
}
