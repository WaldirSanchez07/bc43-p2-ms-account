package com.nttdata.msaccount.domain.service.impl;

import com.nttdata.msaccount.domain.model.PassiveProduct;
import com.nttdata.msaccount.domain.repository.PassiveProductRepository;
import com.nttdata.msaccount.domain.service.PassiveProductService;
import io.reactivex.rxjava3.core.Maybe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PassiveProductServiceImpl implements PassiveProductService {

    private final PassiveProductRepository passiveProductRepository;

    @Override
    public Maybe<PassiveProduct> findById(String id) {
        return passiveProductRepository.findById(id);
    }

}
