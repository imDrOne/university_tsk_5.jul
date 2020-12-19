package ru.miit.lab_5.validators;

import ru.miit.lab_5.annotations.CheckESR;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EsrValidator implements ConstraintValidator<CheckESR, String> {
    @Override
    public boolean isValid(String esr, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("[VALIDATOR  MSG]ESR: " + esr);
        System.out.println("[VALIDATOR  MSG]ESR len:" + esr.length());

        try {
            Integer.parseInt(esr);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
