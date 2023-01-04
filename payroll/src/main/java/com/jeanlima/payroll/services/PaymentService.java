package com.jeanlima.payroll.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jeanlima.payroll.model.Payment;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Billy", 300.0, days);
    }

}
