package com.nttdata.msaccount.application.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {

    private String id;
    private String firstName;
    private String firstSurname;

}
