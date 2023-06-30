package com.nttdata.msaccount.application.dto.validations;

import com.nttdata.msaccount.domain.repository.PassiveProductRepository;
import lombok.AllArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@AllArgsConstructor
public class OnlyCurrentAccountValidator implements ConstraintValidator<OnlyCurrentAccount, String> {

    private final PassiveProductRepository passiveProductRepository;

    @Override
    public void initialize(OnlyCurrentAccount constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String passiveProductId, ConstraintValidatorContext context) {
        return !passiveProductRepository.findById(passiveProductId)
                .filter(product -> product.getName().equals("Cuenta corriente")).isEmpty().blockingGet();
    }

}
