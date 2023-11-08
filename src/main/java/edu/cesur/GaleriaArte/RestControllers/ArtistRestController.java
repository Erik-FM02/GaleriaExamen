package edu.cesur.GaleriaArte.RestControllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.GaleriaArte.Models.ArtistDTO;
import edu.cesur.GaleriaArte.Services.ArtistService;

@RestController
@RequestMapping("/Artits")
public class ArtistRestController {
	
	@Autowired
	ArtistService artistService;
	
	

	@GetMapping()
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(artistService.getAllArtist());
	}
	
	
	
	
	
	
	@PostMapping()
	public ResponseEntity<?> createArtista(@RequestBody @Validated ArtistDTO artist){
		
		artistService.createArtist(artist);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(artist.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();		
		
	}
	
}
