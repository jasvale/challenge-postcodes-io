package com.challenge.api.postcodes.io;

/**
 * Part of the expected structure that will be received from the postcodes.io API 
 * when retrieving the post code information.
 */
public class Codes {
    private String admin_district;
    private String admin_county;
    private String admin_ward;
    private String parish;
    private String parliamentary_constituency;
    private String ccg;
    private String ccg_id;
    private String ced;
    private String nuts;
    private String lsoa;
    private String msoa;
    private String lau2;
    
	public String getAdmin_district() {
		return admin_district;
	}
	
	public String getAdmin_county() {
		return admin_county;
	}
	
	public String getAdmin_ward() {
		return admin_ward;
	}
	
	public String getParish() {
		return parish;
	}
	
	public String getParliamentary_constituency() {
		return parliamentary_constituency;
	}
	
	public String getCcg() {
		return ccg;
	}
	
	public String getCcg_id() {
		return ccg_id;
	}
	
	public String getCed() {
		return ced;
	}
	
	public String getNuts() {
		return nuts;
	}
	
	public String getLsoa() {
		return lsoa;
	}
	
	public String getMsoa() {
		return msoa;
	}
	
	public String getLau2() {
		return lau2;
	}
}
