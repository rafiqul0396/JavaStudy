package com.company.DesignPattern.AdaptorPattern.PaymentAdopter.external;


import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.PaymentProvider;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.RezorpayStuts;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.StripeApi;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.StripeStatus;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.models.PaymentRequest;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.models.PaymentStatus;

// step3: concreate adopter
public class StripeProvider implements PaymentProvider {

    private StripeApi api;
    @Override
    public void createPayment(PaymentRequest request) {

        api.makePayments(request.getEmail());

    }

    @Override
    public PaymentStatus verifyPayment(String PaymentId) {
        StripeStatus stuts=api.status(PaymentId);
        return toStatus(stuts);
    }

    private PaymentStatus toStatus(StripeStatus stuts) {
        if(stuts==StripeStatus.OK){
            return PaymentStatus.OK;

        }
        return PaymentStatus.FUILURE;
    }
}
