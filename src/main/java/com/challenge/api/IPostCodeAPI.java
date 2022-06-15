package com.challenge.api;

import com.challenge.entities.PostCodeSearchResult;

/**
 * Common interface for all Post Code APIs to be used within the application.
 */
public interface IPostCodeAPI {

	public PostCodeSearchResult getPostCodeInformation(String postCode);
	public PostCodeValidation getPostCodeValidation(String postCode);
	
}
