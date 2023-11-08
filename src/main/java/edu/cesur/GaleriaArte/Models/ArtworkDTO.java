package edu.cesur.GaleriaArte.Models;

import edu.cesur.GaleriaArte.Validators.ArtWorkTitleValidator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtworkDTO {

	
	Integer id;
	
	@ArtWorkTitleValidator
	String title;
	
	String description;
	Integer artisId;
	
	
	
}
