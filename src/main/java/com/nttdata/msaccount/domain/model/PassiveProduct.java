package com.nttdata.msaccount.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PassiveProduct {

    private String id;
    private String name;
    private Boolean hasMaintenanceFee;
    private Integer transactionLimit;
    private Integer transactionDay;

}
