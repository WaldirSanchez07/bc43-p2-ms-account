package com.nttdata.msaccount.domain.service.impl;

import com.nttdata.msaccount.domain.model.Payment;
import com.nttdata.msaccount.domain.repository.PaymentRepository;
import com.nttdata.msaccount.domain.service.PaymentService;
import io.reactivex.rxjava3.core.Flowable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

  private final PaymentRepository paymentRepository;

  @Override
  public Flowable<Payment> savePayments(List<Payment> payments, String accountId) {
    return paymentRepository.savePayments(payments, accountId);
  }

}
