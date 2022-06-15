package com.challenge.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.challenge.utils.GenericUtils;

/**
 * Entity used to keep track of history searched of post codes and distances calculated.
 */
@Entity
@Table(name = "postcodes_io_search_results")
public class PostCodeSearchResult {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	public int idSearch;
	
    private String postCode;
    private String country;
    private String ccg;
    private String district;
    private String ward;
    private String lsoa;
    private String msoa;   
    private double latitude;
    private double longitude;
    private double calculatedKilometers;
    private double calculatedMiles;
    private long timestamp;

    public PostCodeSearchResult() {
    	
    }
    
	public PostCodeSearchResult(String postCode, String country, String ccg, String district, String ward,
			String lsoa, String msoa, double latitude, double longitude, long timestamp) {
		this.postCode = postCode;
		this.country = country;
		this.ccg = ccg;
		this.district = district;
		this.ward = ward;
		this.lsoa = lsoa;
		this.msoa = msoa;
		this.latitude = latitude;
		this.longitude = longitude;
		this.timestamp = timestamp;
		
		// perform the calculations and retreive KM and Miles distances	    
		this.calculatedKilometers = GenericUtils.haversine(
				51.4700223,
				-0.4542955, 
				this.latitude, 
				this.longitude
		);
		this.calculatedMiles = GenericUtils.convertKmToMiles(
				calculatedKilometers
		);
	}

	public int getIdSearch() {
		return idSearch;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getCountry() {
		return country;
	}

	public String getDistrict() {
		return district;
	}

	public String getWard() {
		return ward;
	}
	
	public String getLsoa() {
		return lsoa;
	}

	public String getMsoa() {
		return msoa;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getCcg() {
		return ccg;
	}
	
	public double getCalculatedKilometers() {
		return calculatedKilometers;
	}

	public double getCalculatedMiles() {
		return calculatedMiles;
	}

	public long getTimestamp() {
		return timestamp;
	}	
}
