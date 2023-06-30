package com.nttdata.msaccount.application.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PassiveAccountResponse {

    private String id;
    private String accountNumber;
    private String clientId;
    private String passiveAccountId;

}
