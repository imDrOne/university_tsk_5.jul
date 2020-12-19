package ru.miit.lab_5.annotations;

import ru.miit.lab_5.validators.WagonValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Constraint(validatedBy = {WagonValidator.class})
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DoubleMin {
    String message() default "Len value is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
