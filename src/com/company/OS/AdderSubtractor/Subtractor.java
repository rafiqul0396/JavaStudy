package com.company.OS.AdderSubtractor;

public class Subtractor implements Runnable{
    public Subtractor(Count count) {
        this.count = count;
    }

    public Count count;
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            count.value-=1;
        }
    }
}
