package com.challenge.api.postcodes.io;

/**
 * Part of the expected structure that will be received from the postcodes.io API 
 * when retrieving the post code information.
 */
public class Result {
	private String postcode;
	private int quality;
	private int eastings;
	private int northings;
    public String country;
    private String nhs_ha;
    private double longitude;
    private double latitude;
    private String european_electoral_region;
    private String primary_care_trust;
    private String region;
    private String lsoa;
    private String msoa;
    private String incode;
    private String outcode;
    private String parliamentary_constituency;
    private String admin_district;
    private String parish;
    private String admin_county;
    private String admin_ward;
    private String ced;
    private String ccg;
    private String nuts;
    private Codes codes;

	public String getPostcode() {
		return postcode;
	}
	
	public int getQuality() {
		return quality;
	}
	
	public int getEastings() {
		return eastings;
	}
	
	public int getNorthings() {
		return northings;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getNhs_ha() {
		return nhs_ha;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public String getEuropean_electoral_region() {
		return european_electoral_region;
	}
	
	public String getPrimary_care_trust() {
		return primary_care_trust;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getLsoa() {
		return lsoa;
	}
	
	public String getMsoa() {
		return msoa;
	}
	
	public String getIncode() {
		return incode;
	}
	
	public String getOutcode() {
		return outcode;
	}
	
	public String getParliamentary_constituency() {
		return parliamentary_constituency;
	}
	
	public String getAdmin_district() {
		return admin_district;
	}
	
	public String getParish() {
		return parish;
	}
	
	public String getAdmin_county() {
		return admin_county;
	}
	
	public String getAdmin_ward() {
		return admin_ward;
	}
	
	public String getCed() {
		return ced;
	}
	
	public String getCcg() {
		return ccg;
	}
	
	public String getNuts() {
		return nuts;
	}
	
	public Codes getCodes() {
		return codes;
	}
}
