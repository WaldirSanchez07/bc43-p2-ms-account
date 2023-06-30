package com.nttdata.msaccount.application.mapper;

import com.nttdata.msaccount.application.dto.request.PaymentRequest;
import com.nttdata.msaccount.domain.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface PaymentRequestMapper {

  PaymentRequestMapper INSTANCE = Mappers.getMapper(PaymentRequestMapper.class);

  default Payment map(PaymentRequest request) {
    return Payment.builder()
            .amount(request.getAmount())
            .payAt(request.getPayAt())
            .build();
  }

  default List<Payment> map(List<PaymentRequest> request) {
    return request.stream().map(this::map).collect(Collectors.toList());
  }

}
