package com.nttdata.msaccount.domain.service;

import com.nttdata.msaccount.domain.model.PassiveProduct;
import io.reactivex.rxjava3.core.Maybe;

public interface PassiveProductService {

    Maybe<PassiveProduct> findById(String id);

}
