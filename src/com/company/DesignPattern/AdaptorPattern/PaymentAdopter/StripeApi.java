package com.company.DesignPattern.AdaptorPattern.PaymentAdopter;

public class StripeApi {


    // step-1: create the api
    public  void makePayments(String email){
        System.out.println("making payment via Stripe");
    }
    public StripeStatus status(String PaymentId){
            return StripeStatus.OK;
    }
}
