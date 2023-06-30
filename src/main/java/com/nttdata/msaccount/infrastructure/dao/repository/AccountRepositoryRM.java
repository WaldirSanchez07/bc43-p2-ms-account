package com.nttdata.msaccount.infrastructure.dao.repository;

import com.nttdata.msaccount.infrastructure.dao.entity.AccountEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface AccountRepositoryRM extends ReactiveMongoRepository<AccountEntity, String> {

  Mono<Long> countByClientIdAndPassiveProductId(ObjectId clientId, String passiveProductId);
  Mono<Long> countByClientIdAndActiveProductId(ObjectId clientId, String activeProductId);

  Mono<Long> countByClientIdAndPassiveProductIdNot(ObjectId clientId);

}
