package com.nttdata.msaccount.infrastructure.repository;

import com.nttdata.msaccount.domain.model.Balance;
import com.nttdata.msaccount.domain.repository.BalanceRepository;
import com.nttdata.msaccount.infrastructure.dao.repository.BalanceRepositoryRM;
import com.nttdata.msaccount.infrastructure.mapper.BalanceMapper;
import io.reactivex.rxjava3.core.Maybe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class BalanceRepositoryImpl implements BalanceRepository {

    private final BalanceRepositoryRM balanceRepository;

    @Override
    public Maybe<Balance> saveBalance(Balance balance) {
        return Maybe.fromPublisher(balanceRepository
                .save(BalanceMapper.INSTANCE.map(balance))
                .map(BalanceMapper.INSTANCE::map));
    }

}
