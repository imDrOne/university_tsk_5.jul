package ru.miit.lab_5.validators;

import ru.miit.lab_5.Wagon;
import ru.miit.lab_5.annotations.CheckESR;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WagonValidator implements ConstraintValidator<CheckESR, Wagon> {
    @Override
    public boolean isValid(Wagon wagon, ConstraintValidatorContext constraintValidatorContext) {
        double halfConventionalWagons = wagon.getConventionalWagons() * 0.5;
        System.out.println("[VALIDATOR  MSG]Half conventional wagons: " + wagon.getConventionalWagons() * 0.5);
        System.out.println("[VALIDATOR  MSG]Conventional length: " + wagon.getConventionalLength());

        if (wagon.getConventionalLength() < halfConventionalWagons) {
            return false;
        } else {
            return true;
        }
    }
}
