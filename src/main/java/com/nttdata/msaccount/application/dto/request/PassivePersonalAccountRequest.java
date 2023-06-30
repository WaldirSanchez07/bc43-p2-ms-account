package com.nttdata.msaccount.application.dto.request;

import com.nttdata.msaccount.application.dto.validations.ExistPassiveProduct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PassivePersonalAccountRequest {

    @NotEmpty(message = "El campo número de cuenta es requerido")
    @Pattern(regexp = "\\d+", message = "El campo número de cuenta debe ser numérico")
    @Size(min = 20, max = 20, message = "El campo número de cuenta debe tener 20 caracteres")
    private String accountNumber;

    @NotEmpty(message = "El campo cliente es requerido")
    private String clientId;

    @NotNull(message = "El campo monto inicial es requerido")
    private Double amount;

    @NotEmpty(message = "El campo tipo de cuenta es requerido")
    @ExistPassiveProduct
    private String productId;

}
