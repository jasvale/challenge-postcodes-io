package com.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.challenge.services.PostCodeSearchResultService;
import com.challenge.validators.PostCodeConstraint;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.text.DecimalFormat;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The home page for the application controller.
 */
@Controller
@RequestMapping("/")
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private PostCodeSearchResultService postCodeSearchResultService;
	
	@GetMapping
	public String displayHome(Model model) throws JsonProcessingException, NoSuchFieldException, SecurityException {
		// add into the model a container that will be used to retrieve form information
		model.addAttribute("searchParameters", new SearchParameters());
		// add generic objects and lists that are need to render the page
		this.addCommons(model);
		// show home page
		return "home/index";
	}
	
	@PostMapping
	public String searchPostalCode(@Valid SearchParameters searchParameters, Errors errors, Model model) {
		// validate for input errors
		if(errors.hasErrors()) {
			// add generic objects and lists that are need to render the page
			this.addCommons(model);
			// keep in the home page and display the errors
			return "home/index";
		}
		// redirect to the post code page view (concatenation might not be the proper way to perform this)
		return "redirect:/postcode/"+searchParameters.postCode;
	}
	
	
	/**
	 * Adds all common objects and lists that are needed to render the home page.
	 * 
	 * @param model
	 */
	private void addCommons(Model model) {
		model.addAttribute("df", new DecimalFormat("0.00"));
		model.addAttribute("previousPostCodeIoSearches", this.postCodeSearchResultService.findAll(PageRequest.of(0, 3, Sort.by("timestamp").descending())));
	}
	
	/**
	 * Container for user input from the form.
	 * Also configures the needed validations.
	 */
	private class SearchParameters {
		
		/**
		 * The post code to be searched.
		 * Validations are two-fold:
		 * 	- If is not empty.
		 * 	- If the API recognizes it as a valid post code. 
		 */
		@PostCodeConstraint
		public String postCode;
		
		public SearchParameters() { }

		public String getPostCode() {
			return postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}		
	}
}
