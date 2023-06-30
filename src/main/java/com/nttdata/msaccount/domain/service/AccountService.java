package com.nttdata.msaccount.domain.service;

import com.nttdata.msaccount.domain.model.Account;
import io.reactivex.rxjava3.core.Maybe;

public interface AccountService {

  Maybe<Account> save(Account account);

  Maybe<Long> countByClientIdAndPassiveProductId(String clientId, String passiveProductId);

  Maybe<Long> countByClientIdAndActiveProductId(String clientId, String activeProductId);

  Maybe<Long> countByClientIdAndDifferentCurrentAccount(String clientId);

}
