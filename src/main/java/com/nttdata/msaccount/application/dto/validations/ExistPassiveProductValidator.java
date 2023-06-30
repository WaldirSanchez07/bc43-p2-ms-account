package com.nttdata.msaccount.application.dto.validations;

import com.nttdata.msaccount.domain.repository.PassiveProductRepository;
import lombok.AllArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@AllArgsConstructor
public class ExistPassiveProductValidator implements ConstraintValidator<ExistPassiveProduct, String> {

    private final PassiveProductRepository passiveProductRepository;

    @Override
    public void initialize(ExistPassiveProduct constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !passiveProductRepository.findById(value).isEmpty().blockingGet();
    }

}