package com.nttdata.msaccount.infrastructure.dao.repository;

import com.nttdata.msaccount.infrastructure.dao.entity.PaymentEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PaymentRepositoryRM extends ReactiveMongoRepository<PaymentEntity, String> {

}
