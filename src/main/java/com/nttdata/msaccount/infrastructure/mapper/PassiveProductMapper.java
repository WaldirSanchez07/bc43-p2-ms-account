package com.nttdata.msaccount.infrastructure.mapper;

import com.nttdata.msaccount.domain.model.PassiveProduct;
import com.nttdata.msaccount.infrastructure.dao.entity.PassiveProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PassiveProductMapper {

    PassiveProductMapper INSTANCE = Mappers.getMapper(PassiveProductMapper.class);

    default PassiveProduct map(PassiveProductEntity productEntity) {
        return PassiveProduct.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .hasMaintenanceFee(productEntity.getHasMaintenanceFee())
                .transactionLimit(productEntity.getTransactionLimit())
                .transactionDay(productEntity.getTransactionDay())
                .build();
    }

}
