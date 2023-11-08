package edu.cesur.GaleriaArte.Services;

import java.util.List;

import edu.cesur.GaleriaArte.Models.ArtistDTO;

public interface ArtistService {

	ArtistDTO getArtistById(Integer id);
	List<ArtistDTO> getAllArtist();
	void createArtist(ArtistDTO artist);

	
}
