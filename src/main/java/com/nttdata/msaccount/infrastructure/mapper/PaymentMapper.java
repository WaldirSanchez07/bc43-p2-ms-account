package com.nttdata.msaccount.infrastructure.mapper;

import com.nttdata.msaccount.domain.model.Payment;
import com.nttdata.msaccount.infrastructure.dao.entity.PaymentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentMapper {

    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    default Payment map(PaymentEntity payment) {
        return Payment.builder()
                .id(payment.getId())
                .accountId(payment.getAccountId())
                .amount(payment.getAmount())
                .payAt(payment.getPayAt())
                .build();
    }

    default PaymentEntity map(Payment payment) {
        return PaymentEntity.builder()
                .id(payment.getId())
                .accountId(payment.getAccountId())
                .amount(payment.getAmount())
                .state(0)
                .payAt(payment.getPayAt())
                .build();
    }

}
