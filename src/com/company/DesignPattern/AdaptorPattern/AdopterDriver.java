package com.company.DesignPattern.AdaptorPattern;

public class AdopterDriver {
    public static void main(String[] args) {
        //create instance of duck
        MallardDuck duck= new MallardDuck();
        //create instance of turkey
        WildTurkey turkey= new WildTurkey();




        //And then wrap the turkey
        //in a TurkeyAdapter, which
        //makes it look like a Duck.
        Duck turkeyAtopter=new TerkeyAdopter(turkey);


        // Then, let’s test the Turkey:
        //make it gobble, make it fly.
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();


        // Now let’s test the duck
        //by calling the testDuck()
        //method, which expects a
        //Duck object
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        //Now the big test: we try to pass
        //off the turkey as a duck...
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAtopter);


    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
