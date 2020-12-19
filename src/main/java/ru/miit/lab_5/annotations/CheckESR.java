package ru.miit.lab_5.annotations;


import ru.miit.lab_5.validators.EsrValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = EsrValidator.class)
@Size(min = 6, max = 6, message = "Wrong size")
public @interface CheckESR {
    String message() default "is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

