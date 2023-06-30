package com.nttdata.msaccount.infrastructure.repository;

import com.nttdata.msaccount.domain.model.Account;
import com.nttdata.msaccount.domain.repository.AccountRepository;
import com.nttdata.msaccount.infrastructure.dao.entity.AccountEntity;
import com.nttdata.msaccount.infrastructure.dao.repository.AccountRepositoryRM;
import com.nttdata.msaccount.infrastructure.mapper.AccountMapper;
import io.reactivex.rxjava3.core.Maybe;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

  private final AccountRepositoryRM accountRepositoryRM;

  @Override
  public Maybe<Account> save(Account account) {
    Mono<AccountEntity> mono = accountRepositoryRM
            .save(AccountMapper.INSTANCE.map(account));
    return Maybe.fromPublisher(AccountMapper.INSTANCE.map(mono));
  }

  @Override
  public Maybe<Long> countByClientIdAndPassiveProductId(String clientId, String passiveProductId) {
    ObjectId clientIdObj = new ObjectId(clientId);
    Mono<Long> mono = accountRepositoryRM
            .countByClientIdAndPassiveProductId(clientIdObj, passiveProductId)
            .defaultIfEmpty(0L);
    return Maybe.fromPublisher(mono);
  }

  @Override
  public Maybe<Long> countByClientIdAndActiveProductId(String clientId, String activeProductId) {
    ObjectId clientIdObj = new ObjectId(clientId);
    Mono<Long> mono = accountRepositoryRM
            .countByClientIdAndActiveProductId(clientIdObj, activeProductId)
            .defaultIfEmpty(0L);
    return Maybe.fromPublisher(mono);
  }

  @Override
  public Maybe<Long> countByClientIdAndDifferentCurrentAccount(String clientId) {
    ObjectId clientIdObj = new ObjectId(clientId);
    Mono<Long> mono = accountRepositoryRM
            .countByClientIdAndPassiveProductIdNot(clientIdObj)
            .defaultIfEmpty(0L);
    return Maybe.fromPublisher(mono);
  }

}
