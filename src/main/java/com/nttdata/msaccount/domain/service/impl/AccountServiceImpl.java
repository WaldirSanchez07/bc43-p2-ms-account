package com.nttdata.msaccount.domain.service.impl;

import com.nttdata.msaccount.domain.model.Account;
import com.nttdata.msaccount.domain.repository.AccountRepository;
import com.nttdata.msaccount.domain.service.AccountService;
import io.reactivex.rxjava3.core.Maybe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

  private final AccountRepository accountRepository;

  @Override
  public Maybe<Account> save(Account account) {
    return accountRepository.save(account);
  }

  @Override
  public Maybe<Long> countByClientIdAndPassiveProductId(String clientId, String passiveProductId) {
    return accountRepository.countByClientIdAndPassiveProductId(clientId, passiveProductId);
  }

    @Override
    public Maybe<Long> countByClientIdAndActiveProductId(String clientId, String activeProductId) {
        return accountRepository.countByClientIdAndActiveProductId(clientId, activeProductId);
    }

    @Override
  public Maybe<Long> countByClientIdAndDifferentCurrentAccount(String clientId) {
    return accountRepository.countByClientIdAndDifferentCurrentAccount(clientId);
  }


}
