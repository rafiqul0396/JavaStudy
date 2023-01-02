package com.company.DesignPattern.AdaptorPattern.PaymentAdopter;


import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.models.PaymentRequest;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.models.PaymentStatus;

// step2: create ur adopter interface
public interface PaymentProvider {
    public  void  createPayment(PaymentRequest request);
    public PaymentStatus verifyPayment(String PaymentId);


}
