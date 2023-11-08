package edu.cesur.GaleriaArte.RestControllers;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.GaleriaArte.Models.ArtworkDTO;
import edu.cesur.GaleriaArte.Services.ArtworkService;



@RestController
@RequestMapping("/Artworks")
public class ArtworkRestController {
	
	@Autowired
	ArtworkService artworkService;
	

    public ArtworkRestController (ArtworkService artworkService) {
        this.artworkService = artworkService;
            
    }
    
  
    
    
    @GetMapping()
	public ResponseEntity<?> getAllArtworks(){
		return ResponseEntity.ok(artworkService.getAllArtworks());
	}
    
   
    
    
    @PostMapping()
	public ResponseEntity<?> reserveBook(@PathVariable ArtworkDTO artwork){
		
    	artworkService.createArtwork(artwork);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(artwork.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();		
		
	}
}

	
