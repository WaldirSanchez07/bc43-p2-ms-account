package com.nttdata.msaccount.domain.model;

import lombok.*;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private String id;
    private ObjectId accountId;
    private Double amount;
    private Integer state;
    private LocalDate payAt;

}
