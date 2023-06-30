package com.nttdata.msaccount.domain.repository;

import com.nttdata.msaccount.domain.model.Account;
import io.reactivex.rxjava3.core.Maybe;

public interface AccountRepository {

  Maybe<Account> save(Account account);

  Maybe<Long> countByClientIdAndPassiveProductId(String clientId, String passiveProductId);

  Maybe<Long> countByClientIdAndActiveProductId(String clientId, String activeProductId);

  Maybe<Long> countByClientIdAndDifferentCurrentAccount(String clientId);

}
