package com.nttdata.msaccount.infrastructure.mapper;

import com.nttdata.msaccount.domain.model.Account;
import com.nttdata.msaccount.infrastructure.dao.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import reactor.core.publisher.Mono;

@Mapper
public interface AccountMapper {

  AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

  default Account map(AccountEntity accountEntity) {
    return Account.builder()
            .id(accountEntity.getId())
            .accountNumber(accountEntity.getAccountNumber())
            .clientId(accountEntity.getClientId())
            .passiveProductId(accountEntity.getPassiveProductId())
            .activeProductId(accountEntity.getActiveProductId())
            .authorizedSigners(accountEntity.getAuthorizedSigners())
            .date(accountEntity.getDate())
            .build();
  }

  default AccountEntity map(Account account) {
    return AccountEntity.builder()
            .id(account.getId())
            .accountNumber(account.getAccountNumber())
            .clientId(account.getClientId())
            .passiveProductId(account.getPassiveProductId())
            .activeProductId(account.getActiveProductId())
            .authorizedSigners(account.getAuthorizedSigners())
            .date(account.getDate())
            .build();
  }

  default Mono<Account> map(Mono<AccountEntity> accountEntityMono) {
    return accountEntityMono.map(this::map);
  }

}
