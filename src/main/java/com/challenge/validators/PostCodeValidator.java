package com.challenge.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.challenge.api.PostCodeApiFactory;
import com.challenge.api.PostCodeApiOptions;
import com.challenge.api.PostCodeValidation;

public class PostCodeValidator implements ConstraintValidator<PostCodeConstraint, String> {

  @Override
  public void initialize(PostCodeConstraint contactNumber) { }

  @Override
  public boolean isValid(String postCode, ConstraintValidatorContext cxt) {
	  	// empty is not valid from the go, don't bother keep going
	  	if(postCode.isEmpty())
	  		return false;
	  	
	  	// validate the post code against the third party API
	  	PostCodeValidation postCodeValidation = PostCodeApiFactory.get(PostCodeApiOptions.POST_CODES_IO).getPostCodeValidation(postCode);
	    
	  	// validate will be a OK status from API as well as a actual validation of the post code
	    return postCodeValidation.getStatus() == 200 && postCodeValidation.getResult();
  }

}