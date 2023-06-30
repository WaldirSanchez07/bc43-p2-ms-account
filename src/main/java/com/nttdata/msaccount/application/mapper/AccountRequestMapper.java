package com.nttdata.msaccount.application.mapper;

import com.nttdata.msaccount.application.dto.request.ActiveEnterpriseAccountRequest;
import com.nttdata.msaccount.application.dto.request.ActivePersonalAccountRequest;
import com.nttdata.msaccount.application.dto.request.PassiveEnterpriseAccountRequest;
import com.nttdata.msaccount.application.dto.request.PassivePersonalAccountRequest;
import com.nttdata.msaccount.domain.model.Account;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Mapper
public interface AccountRequestMapper {

  AccountRequestMapper INSTANCE = Mappers.getMapper(AccountRequestMapper.class);

  default Account map(PassivePersonalAccountRequest request) {
    return Account.builder()
            .clientId(new ObjectId(request.getClientId()))
            .accountNumber(request.getAccountNumber())
            .passiveProductId(request.getProductId())
            .date(LocalDateTime.now())
            .build();
  }

  default Account map(PassiveEnterpriseAccountRequest request) {
    return Account.builder()
            .clientId(new ObjectId(request.getClientId()))
            .accountNumber(request.getAccountNumber())
            .passiveProductId("CB2")
            .date(LocalDateTime.now())
            .build();
  }

  default Account map(ActivePersonalAccountRequest request) {
    return Account.builder()
            .clientId(new ObjectId(request.getClientId()))
            .accountNumber(request.getAccountNumber())
            .activeProductId("CC1")
            .date(LocalDateTime.now())
            .build();
  }

  default Account map(ActiveEnterpriseAccountRequest request) {
    return Account.builder()
            .clientId(new ObjectId(request.getClientId()))
            .accountNumber(request.getAccountNumber())
            .activeProductId("CC2")
            .authorizedSigners(request.getSignatories()
                    .stream()
                    .map(PersonRequestMapper.INSTANCE::map)
                    .collect(Collectors.toList()))
            .date(LocalDateTime.now())
            .build();
  }

}
