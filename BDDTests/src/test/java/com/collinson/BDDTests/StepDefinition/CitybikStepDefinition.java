package com.collinson.BDDTests.StepDefinition;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.collinson.BDDTests.SupportLib.CitybikData;
import com.collinson.BDDTests.SupportLib.CitybikStepRestImpl;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// This is the class for the Step definition of the city bike feature

public class CitybikStepDefinition {
	CitybikStepRestImpl restimpl= null;
	CitybikData data =null;
	String geolocation = null;
	

@Given("I get {string} the exact location of city bikes")
public void i_get_the_exact_location_of_city_bikes(String url) {
	data = new CitybikData();
    restimpl= new CitybikStepRestImpl();
    data.setApplianceIP(url);      
    restimpl.getData(data);

}

@Given("verify the {int}")
public void verify_the(Integer int1) {
	data.setExpectedStatusCode(int1);
	assertEquals(data.getActualStatusCode(),data.getExpectedStatusCode());
    
}



@When("I read the location data {string} and verify that {string} is in {string}")
public void i_read_the_location_data_and_verify_that_is_in(String datafilter, String cityName, String countryCode) {
	  geolocation = restimpl.validatelocations(data, datafilter, countryCode, cityName);
	//TODO Implement logging
      System.out.println("The location details are:"+geolocation);
}

@Then("I check the latitude and longitude")
public void i_check_the_latitude_and_longitude() {
	
	if (geolocation!=null) {
		
	   if (geolocation.contains("latitude") && geolocation.contains("longitude")) {
		 
		 System.out.println("Successfully validated latitude and longitude");
		assertTrue(true);
		 
	     }}
    else {
    
    	System.out.println("Failed to get the correct location details");
		assertTrue(false);
		
	}
}



}
