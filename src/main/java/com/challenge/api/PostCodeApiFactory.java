package com.challenge.api;

import com.challenge.api.postcodes.io.PostCodesIOAPI;

/**
 * Factory to create new API accesses throughout the application.
 */
public class PostCodeApiFactory {
	
	public static IPostCodeAPI get(PostCodeApiOptions option) {
		switch (option) {
			case POST_CODES_IO:
				return new PostCodesIOAPI();
			default:
				return null;
		}
	}
}
