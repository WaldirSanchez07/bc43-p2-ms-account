package com.nttdata.msaccount.application.dto.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OnlyCurrentAccountValidator.class)
public @interface OnlyCurrentAccount {

    String message() default "El campo tipo de cuenta solo puede ser (cuenta corriente)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
