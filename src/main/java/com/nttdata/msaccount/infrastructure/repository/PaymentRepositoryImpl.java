package com.nttdata.msaccount.infrastructure.repository;

import com.nttdata.msaccount.domain.model.Payment;
import com.nttdata.msaccount.domain.repository.PaymentRepository;
import com.nttdata.msaccount.infrastructure.dao.repository.PaymentRepositoryRM;
import com.nttdata.msaccount.infrastructure.mapper.PaymentMapper;
import io.reactivex.rxjava3.core.Flowable;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PaymentRepositoryImpl implements PaymentRepository {

  private final PaymentRepositoryRM paymentRepository;

  @Override
  public Flowable<Payment> savePayments(List<Payment> payment, String accountId) {
    return Flowable.fromIterable(payment)
            .flatMap(obj -> {
              obj.setAccountId(new ObjectId(accountId));
              return paymentRepository.save(PaymentMapper.INSTANCE.map(obj)).map(PaymentMapper.INSTANCE::map);
            });
  }

}
