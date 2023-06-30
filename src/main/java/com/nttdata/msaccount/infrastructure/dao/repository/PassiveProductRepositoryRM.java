package com.nttdata.msaccount.infrastructure.dao.repository;

import com.nttdata.msaccount.infrastructure.dao.entity.PassiveProductEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PassiveProductRepositoryRM extends ReactiveMongoRepository<PassiveProductEntity, String> {

}
