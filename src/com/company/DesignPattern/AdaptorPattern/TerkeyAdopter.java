package com.company.DesignPattern.AdaptorPattern;



// first ,you need to implements the interface of the type you're adapting to
// this is the interface your clients expects to see
public class TerkeyAdopter implements Duck{
    private  Terkey terkey;

    // Next, we need to get a reference to
    //the object that we are adapting; here
    //we do that through the constructor.

    public  TerkeyAdopter(Terkey terkey){
        this.terkey=terkey;
    }


    //Now we need to implement all the methods in
    //the interface; the quack() translation between
    //classes is easy: just call the gobble() method
    @Override
    public void quack() {
        terkey.gobble();

    }


    //Even though both interfaces have a fly()
    //method, Turkeys fly in short spurts - they
    //can’t do long-distance flying like ducks. To
    //map between a Duck’s fly() method and a
    //Turkey’s, we need to call the Turkey’s fly()
    //method five times to make up for it.
    @Override
    public void fly() {
        for (int i=0;i<5;i++){
            terkey.fly();
        }

    }


}
