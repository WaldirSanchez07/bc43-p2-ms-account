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
public class Person {

    private String dni;
    private String firstName;
    private String otherNames;
    private String firstSurname;
    private String secondSurname;

}
