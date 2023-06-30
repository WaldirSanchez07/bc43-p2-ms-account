package com.nttdata.msaccount.domain.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Balance {

    private String id;
    private ObjectId accountId;
    private Double amount;
    private LocalDateTime date;

}
