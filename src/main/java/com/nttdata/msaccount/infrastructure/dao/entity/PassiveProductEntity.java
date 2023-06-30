package com.nttdata.msaccount.infrastructure.dao.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "passive_products")
public class PassiveProductEntity {

    private String id;
    private String name;
    private Boolean hasMaintenanceFee;
    private Integer transactionLimit;
    private Integer transactionDay;

}
