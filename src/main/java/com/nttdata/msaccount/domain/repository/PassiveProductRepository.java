package com.nttdata.msaccount.domain.repository;

import com.nttdata.msaccount.domain.model.PassiveProduct;
import io.reactivex.rxjava3.core.Maybe;

public interface PassiveProductRepository {

    Maybe<PassiveProduct> findById(String id);

}
