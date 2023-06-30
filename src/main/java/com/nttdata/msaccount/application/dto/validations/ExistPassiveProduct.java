package com.nttdata.msaccount.application.dto.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ExistPassiveProductValidator.class)
public @interface ExistPassiveProduct {

    String message() default "El campo tipo de cuenta es inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
