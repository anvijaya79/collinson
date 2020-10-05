package com.collinson.BDDTests.SupportLib;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//This is the class for Rest Implementation

public class CitybikStepRestImpl {
	
	 String applianceUrl = null;
	 Response response = null;
	 int responseCode= 0;
	 RequestSpecification reqSpec;
	 int actualStatusCode;
	
	 /**
	     * Gets data for Rest Call	     * 
	     * @param CitybikData 
	     * @return Updated CityData
	     */
	
	public CitybikData getData(CitybikData data)
    {
		try {
			 
                       applianceUrl =  data.getApplianceIP();              	
                                     response= given().
                		             header(RestConstants.ACCEPT, RestConstants.APPLICATION_JSON).
                                     contentType(RestConstants.APPLICATION_JSON).
                                      headers("Accept-Language", "en-US").
                                      when().get(applianceUrl + RestConstants.NETWORKS_URI);
                
           
            responseCode= response.getStatusCode();            
            data.setActualStatusCode(response.getStatusCode());
           System.out.println("The response code is as follows:"+responseCode);
            data.setResponse(response);
   
		}
		catch (Exception e) {
			System.out.println("there's an exception thrown in getData method!:" + e.getLocalizedMessage());
		}
		return data;
    }
	
	 /**
     * Validate Locations	     * 
     * @param CitybikData , String location ,String country, String city
     * @return String CitybikData
     */

	
	public String validatelocations(CitybikData data, String locationpath, String country, String city) {
		  List value = data.getResponse().body().jsonPath().get(locationpath);
          ArrayList<String> otherList = new ArrayList<String>();
          String location = null;
          for(int i = 0; i < value.size(); i++) {
          	//System.out.println(value.get(i));
          	
          		String val = value.get(i).toString();
          		if (val.contains(country)){
          			
          			otherList.add(val);
             			
          			
          		}
          		
          		
          }
          
          for (int j = 0;j< otherList.size();j++) {
          	location = otherList.get(j).toString();
          
          if (location.contains(city)){
          System.out.println("Successfully validated "+city+" in "+country);
  
          	return location;
          }
          }
          return null;
	}
	
	
	

}
