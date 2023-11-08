package edu.cesur.GaleriaArte.Models;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtistDTO {
	
	@NotNull
	Integer id;
	String name;
	

}
