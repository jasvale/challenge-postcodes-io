package com.challenge.api.postcodes.io;

/**
 * Main class of the of the expected structure that will be received from the postcodes.io API 
 * when retrieving the post code information.
 */
public class PostCode {
	private int status;
	private Result result;
    
	public PostCode() {
		this.status = 400;
		this.result = new Result();
	}

	public int getStatus() {
		return status;
	}
	
	public Result getResult() {
		return result;
	}
}
