package com.nttdata.msaccount.domain.repository;

import com.nttdata.msaccount.domain.model.Balance;
import io.reactivex.rxjava3.core.Maybe;

public interface BalanceRepository {

    Maybe<Balance> saveBalance(Balance balance);

}
