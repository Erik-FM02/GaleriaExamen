package edu.cesur.GaleriaArte.Services;

import java.util.List;

import edu.cesur.GaleriaArte.Models.ArtworkDTO;

public interface ArtworkService {

	
	List<ArtworkDTO> getAllArtworks();
	
	void createArtwork(ArtworkDTO artwork);
	

	
	
	
	
}
