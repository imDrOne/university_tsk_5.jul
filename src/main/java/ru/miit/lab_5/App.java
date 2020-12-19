package ru.miit.lab_5;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class App {
    private static void validateRollingStock(Wagon wagon) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Wagon>> violations = validator.validate(wagon);

        for (ConstraintViolation<Wagon> violation : violations) {
            System.out.println(violation.getMessage() + "\n");
            System.err.println("Error in object: " + "\n" + wagon);
        }
    }

    public static void main(String[] args) {
        Wagon wagon = new Wagon("123456",2.5, 12);

        validateRollingStock(wagon);
    }
}
