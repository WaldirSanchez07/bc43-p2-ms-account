package com.nttdata.msaccount.infrastructure.controller;

import com.nttdata.msaccount.application.dto.request.ActiveEnterpriseAccountRequest;
import com.nttdata.msaccount.application.dto.request.ActivePersonalAccountRequest;
import com.nttdata.msaccount.application.dto.request.PassiveEnterpriseAccountRequest;
import com.nttdata.msaccount.application.dto.request.PassivePersonalAccountRequest;
import com.nttdata.msaccount.application.dto.response.ObjectResponse;
import com.nttdata.msaccount.application.service.BankAccountExternalService;
import com.nttdata.msaccount.application.service.CreditAccountExternalService;
import io.reactivex.rxjava3.core.Maybe;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private final BankAccountExternalService bankAccountService;
    private final CreditAccountExternalService creditAccountService;

    @PostMapping(value = "/personal-bank-account/create", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Maybe<ObjectResponse> saveBankAccount(@Valid @RequestBody PassivePersonalAccountRequest request) {
        return bankAccountService.saveAccount(request);
    }

    @PostMapping(value = "/personal-credit/create", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Maybe<ObjectResponse> saveAccountPC(@Valid @RequestBody ActivePersonalAccountRequest request) {
        return creditAccountService.savePersonalCreditAccount(request);
    }

    @PostMapping(value = "/enterprise-credit/create", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Maybe<ObjectResponse> saveAccountEC(@Valid @RequestBody ActiveEnterpriseAccountRequest request) {
        return creditAccountService.saveEnterpriseCreditAccount(request);
    }

    @PostMapping(value = "/enterprise-current/create", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Maybe<ObjectResponse> saveAccountECurrent(@Valid @RequestBody PassiveEnterpriseAccountRequest request) {
        return bankAccountService.saveEnterpriseBankAccount(request);
    }

}
