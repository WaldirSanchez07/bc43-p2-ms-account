package com.nttdata.msaccount.infrastructure.dao.repository;

import com.nttdata.msaccount.infrastructure.dao.entity.BalanceEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BalanceRepositoryRM extends ReactiveMongoRepository<BalanceEntity, String> {

}
