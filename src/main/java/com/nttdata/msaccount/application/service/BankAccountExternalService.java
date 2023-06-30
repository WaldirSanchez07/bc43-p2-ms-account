package com.nttdata.msaccount.application.service;

import com.nttdata.msaccount.application.dto.request.PassiveEnterpriseAccountRequest;
import com.nttdata.msaccount.application.dto.request.PassivePersonalAccountRequest;
import com.nttdata.msaccount.application.dto.response.ObjectResponse;
import io.reactivex.rxjava3.core.Maybe;

public interface BankAccountExternalService {

  Maybe<ObjectResponse> saveAccount(PassivePersonalAccountRequest request);

  Maybe<ObjectResponse> saveEnterpriseBankAccount(PassiveEnterpriseAccountRequest request);

}
