package com.nttdata.msaccount.application.service.impl;

import com.nttdata.msaccount.application.dto.request.PassiveEnterpriseAccountRequest;
import com.nttdata.msaccount.application.dto.request.PassivePersonalAccountRequest;
import com.nttdata.msaccount.application.dto.response.ObjectResponse;
import com.nttdata.msaccount.application.mapper.AccountRequestMapper;
import com.nttdata.msaccount.application.service.BankAccountExternalService;
import com.nttdata.msaccount.domain.service.AccountService;
import io.reactivex.rxjava3.core.Maybe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BankAccountExternalServiceImpl implements BankAccountExternalService {

  private final AccountService accountService;

  @Override
  public Maybe<ObjectResponse> saveAccount(PassivePersonalAccountRequest request) {
    String msj = "Ya tienes una cuenta de este producto, solo puedes una cuenta de cada producto!";
    return accountService
            .countByClientIdAndPassiveProductId(request.getClientId(), request.getProductId())
            .filter(count -> count == 0)
            .flatMap(count -> accountService
                    .save(AccountRequestMapper.INSTANCE.map(request))
                    .map(obj -> new ObjectResponse(201, "Cuenta bancaria creada!", null)))
            .switchIfEmpty(Maybe.error(new Throwable(msj)))
            .onErrorResumeNext(error -> Maybe.error(new Throwable(error.getMessage())));
  }

  @Override
  public Maybe<ObjectResponse> saveEnterpriseBankAccount(PassiveEnterpriseAccountRequest request) {
    return accountService
            .save(AccountRequestMapper.INSTANCE.map(request))
            .map(obj -> new ObjectResponse(201, "Cuenta bancaria creada!", null))
            .onErrorResumeNext(error -> Maybe.error(new Throwable(error.getMessage())));
  }

}
