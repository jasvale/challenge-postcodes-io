package com.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.challenge.api.PostCodeApiFactory;
import com.challenge.api.PostCodeApiOptions;
import com.challenge.entities.PostCodeSearchResult;
import com.challenge.services.PostCodeSearchResultService;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.text.DecimalFormat;

/**
 * Controller for showing information about a post code.
 */
@Controller
@RequestMapping("/postcode")
public class PostCodeController {

	@Autowired
	private PostCodeSearchResultService postCodeSearchResultService;	
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	@GetMapping("/{postcode}")
	public String displayHome(@PathVariable("postcode") String postcode, Model model) throws JsonProcessingException, NoSuchFieldException, SecurityException {	
		// read the post code information from the API
		PostCodeSearchResult postCodeSearchResult = PostCodeApiFactory.get(PostCodeApiOptions.POST_CODES_IO).getPostCodeInformation(postcode);
	    
	    // save for historic purposes
	    this.postCodeSearchResultService.save(postCodeSearchResult);
	    
	    // add the data to the model for user presentation
	    model.addAttribute("postCodeSearchResult", postCodeSearchResult);
	    model.addAttribute("df", df);
	    
	    return "postcodes/index";
	}
}
