package com.company.DesignPattern.AdaptorPattern.PaymentAdopter;

public class RezarpayApi {


    public  void makePayments(String email, String phone){
        System.out.println("making payment via Rezorpay");
    }
    public  RezorpayStuts checkStatus(String PaymentId){
        return  RezorpayStuts.SUCCESS;
    }

}
