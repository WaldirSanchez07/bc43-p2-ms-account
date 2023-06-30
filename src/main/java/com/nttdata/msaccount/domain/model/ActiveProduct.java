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
public class ActiveProduct {

    private String id;
    private String name;
    private Integer creditLimit;

}
