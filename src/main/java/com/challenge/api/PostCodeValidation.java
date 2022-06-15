package com.challenge.api;

/**
 * No matter what the implementation of the API is (or even manually coded validations),
 *  the final result for validation should do not require more than this structure.
 */
public class PostCodeValidation {
	private int status;
	private boolean result;
	
	public int getStatus() {
		return status;
	}
	public boolean getResult() {
		return result;
	}
}
