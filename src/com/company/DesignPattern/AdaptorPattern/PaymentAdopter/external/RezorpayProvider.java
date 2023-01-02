package com.company.DesignPattern.AdaptorPattern.PaymentAdopter.external;

import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.PaymentProvider;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.RezarpayApi;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.RezorpayStuts;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.models.PaymentRequest;
import com.company.DesignPattern.AdaptorPattern.PaymentAdopter.models.PaymentStatus;

public class RezorpayProvider implements PaymentProvider {
    private RezarpayApi api;
    @Override
    public void createPayment(PaymentRequest request) {
        api.makePayments(request.getEmail(),request.getPhone());

    }

    @Override
    public PaymentStatus verifyPayment(String PaymentId) {
        RezorpayStuts stuts=api.checkStatus(PaymentId);
        return toStatus(stuts);
    }

    private PaymentStatus toStatus(RezorpayStuts stuts) {
        if(stuts==RezorpayStuts.SUCCESS){
            return PaymentStatus.SUCCESS;

        }
        return PaymentStatus.ERROR;
    }
}
