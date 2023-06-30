package com.nttdata.msaccount.domain.service;

import com.nttdata.msaccount.domain.model.Payment;
import io.reactivex.rxjava3.core.Flowable;

import java.util.List;

public interface PaymentService {

    Flowable<Payment> savePayments(List<Payment> payment, String accountId);

}
