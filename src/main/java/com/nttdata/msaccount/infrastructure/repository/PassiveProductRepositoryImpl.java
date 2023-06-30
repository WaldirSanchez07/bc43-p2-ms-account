package com.nttdata.msaccount.infrastructure.repository;

import com.nttdata.msaccount.domain.model.PassiveProduct;
import com.nttdata.msaccount.domain.repository.PassiveProductRepository;
import com.nttdata.msaccount.infrastructure.dao.repository.PassiveProductRepositoryRM;
import com.nttdata.msaccount.infrastructure.mapper.PassiveProductMapper;
import io.reactivex.rxjava3.core.Maybe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class PassiveProductRepositoryImpl implements PassiveProductRepository {

  private final PassiveProductRepositoryRM passiveProductRepositoryRM;

  @Override
  public Maybe<PassiveProduct> findById(String id) {
    Mono<PassiveProduct> passiveProduct = passiveProductRepositoryRM
            .findById(id)
            .map(PassiveProductMapper.INSTANCE::map);
    return Maybe.fromPublisher(passiveProduct);
  }

}
