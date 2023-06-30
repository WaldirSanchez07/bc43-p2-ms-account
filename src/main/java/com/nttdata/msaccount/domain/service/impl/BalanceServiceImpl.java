package com.nttdata.msaccount.domain.service.impl;

import com.nttdata.msaccount.domain.model.Balance;
import com.nttdata.msaccount.domain.repository.BalanceRepository;
import com.nttdata.msaccount.domain.service.BalanceService;
import io.reactivex.rxjava3.core.Maybe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BalanceServiceImpl implements BalanceService {

    private final BalanceRepository balanceRepository;

    @Override
    public Maybe<Balance> saveBalance(Balance balance) {
        return balanceRepository.saveBalance(balance);
    }

}
