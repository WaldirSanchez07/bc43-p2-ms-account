package com.nttdata.msaccount.domain.service;

import com.nttdata.msaccount.domain.model.Balance;
import io.reactivex.rxjava3.core.Maybe;

public interface BalanceService {

    Maybe<Balance> saveBalance(Balance balance);

}
