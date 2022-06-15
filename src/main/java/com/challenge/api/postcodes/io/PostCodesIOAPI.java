package com.challenge.api.postcodes.io;

import java.time.Instant;

import org.springframework.web.client.RestTemplate;

import com.challenge.api.IPostCodeAPI;
import com.challenge.api.PostCodeValidation;
import com.challenge.entities.PostCodeSearchResult;

/**
 * Only place that should manage calls to the postcodes.io API.
 */
public class PostCodesIOAPI implements IPostCodeAPI {
	
	// url for the api.postcodes. In the future it should be configured in configuration files.
	private static String apiURL = "http://api.postcodes.io";
	
	public PostCodeSearchResult getPostCodeInformation(String postCode) {
	    final String uri = apiURL+"/postcodes/"+ postCode;
	    RestTemplate restTemplate = new RestTemplate();
	    PostCode postCodeData = restTemplate.getForObject(uri, PostCode.class);
	    Result result = postCodeData.getResult();	    
		return new PostCodeSearchResult(
    			result.getPostcode(),
    			result.getCountry(),
    			result.getCcg(),
    			result.getAdmin_district(),
    			result.getAdmin_ward(),
    			result.getLsoa(),
    			result.getMsoa(),
    			result.getLatitude(),
    			result.getLongitude(),
    			Instant.now().toEpochMilli()
		);
	}
	
	public PostCodeValidation getPostCodeValidation(String postCode) {
	    final String uri = apiURL+"/postcodes/"+postCode+"/validate";
	    RestTemplate restTemplate = new RestTemplate();
	    return restTemplate.getForObject(uri, PostCodeValidation.class);
	}
}
