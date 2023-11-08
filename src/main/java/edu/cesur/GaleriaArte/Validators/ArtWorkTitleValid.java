package edu.cesur.GaleriaArte.Validators;

import jakarta.validation.ConstraintValidator;

import jakarta.validation.ConstraintValidatorContext;

public class ArtWorkTitleValid implements ConstraintValidator<ArtWorkTitleValidator, String>  {

	
	
	@Override
	public void initialize(ArtWorkTitleValidator constraintAnnotation) {
	}	
	
	
	@Override
	public boolean isValid(String valor, ConstraintValidatorContext context) {
		if (valor == null || valor.trim().isEmpty()) {

			return false;

			}

			String[] palabras = valor.trim().split("\\s+");

			return palabras.length >= 5;
	
}
}