package com.nttdata.msaccount.application.service;

import com.nttdata.msaccount.application.dto.request.ActiveEnterpriseAccountRequest;
import com.nttdata.msaccount.application.dto.request.ActivePersonalAccountRequest;
import com.nttdata.msaccount.application.dto.response.ObjectResponse;
import io.reactivex.rxjava3.core.Maybe;

public interface CreditAccountExternalService {

  Maybe<ObjectResponse> savePersonalCreditAccount(ActivePersonalAccountRequest request);

  Maybe<ObjectResponse> saveEnterpriseCreditAccount(ActiveEnterpriseAccountRequest request);

}
