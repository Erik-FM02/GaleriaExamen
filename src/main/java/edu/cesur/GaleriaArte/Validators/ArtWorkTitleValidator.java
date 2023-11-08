package edu.cesur.GaleriaArte.Validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = ArtWorkTitleValid.class)
public @interface ArtWorkTitleValidator {

	String message() default "Código inválido." 
			+ " Debe contener al menos 5 palabras.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	
	
	
}
