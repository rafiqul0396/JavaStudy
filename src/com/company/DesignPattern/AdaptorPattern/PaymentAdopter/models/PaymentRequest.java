package com.company.DesignPattern.AdaptorPattern.PaymentAdopter.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {
    private  String phone;
    private  String email;
    private  String name;
}
