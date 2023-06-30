package com.nttdata.msaccount.infrastructure.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
class ErrorResponse {

    private String message;
    private Integer status;
    private Map<String, String> errors;
}
