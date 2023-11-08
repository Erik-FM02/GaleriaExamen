package edu.cesur.GaleriaArte.Exceptions.Handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.GaleriaArte.Exceptions.ArtworkCreationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler( ArtworkCreationException.class )
	public ProblemDetail handleBookNotFoundException(ArtworkCreationException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Artwork Exception Occurred");
		problemDetail.setType(URI.create("http://securityciclople.com"));
		problemDetail.setProperty("errorCategory", "Artwork");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	
}
