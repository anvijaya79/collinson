package com.collinson.BDDTests.SupportLib;
import java.util.List;

import org.json.JSONObject;

import io.restassured.response.Response;


public class CitybikData {
	

	
	    private String applianceIP;
	    private String RallyTestCaseTitle;
	    JSONObject requestjsonobj = new JSONObject();
	    private int expectedStatusCode;
	    private int actualStatusCode;
	    private Response response;
	    private String requestType;
	    private String taskuri;
	    private String RequestUri;

	    /**
	     * @return the rallyTestCaseTitle
	     */
	    public String getRallyTestCaseTitle()
	    {
	        return RallyTestCaseTitle;
	    }

	    /**
	     * @param rallyTestCaseTitle the rallyTestCaseTitle to set
	     */
	    public void setRallyTestCaseTitle(final String rallyTestCaseTitle)
	    {
	        RallyTestCaseTitle = rallyTestCaseTitle;
	    }

	   
		    /**
	     * @param requestUri the requestUri to set
	     */
	    public void setRequestUri(final String requestUri)
	    {
	        RequestUri = requestUri;
	    }

	
	    public String getTaskUri(){
	        return taskuri;
	        
	    }
	 public void setTaskUri(String Taskuri) {
	     
	     taskuri=Taskuri;
	 }
	 

	    /**
	     * @return the expectedStatusCode
	     */
	    public int getExpectedStatusCode()
	    {
	        return expectedStatusCode;
	    }

	    /**
	     * @param expectedStatusCode the expectedStatusCode to set
	     */
	    public void setExpectedStatusCode(final int expectedStatusCode)
	    {
	        this.expectedStatusCode = expectedStatusCode;
	    }

	    /**
	     * @return the actualStatusCode
	     */
	    public int getActualStatusCode()
	    {
	        return actualStatusCode;
	    }

	    /**
	     * @param actualStatusCode the actualStatusCode to set
	     */
	    public void setActualStatusCode(final int actualStatusCode)
	    {
	        this.actualStatusCode = actualStatusCode;
	    }

	    /**
	     * @return the applianceIP
	     */
	    public String getApplianceIP()
	    {
	        return applianceIP;
	    }

	    /**
	     * @param applianceIP the applianceIP to set
	     */
	    public void setApplianceIP(final String applianceIP)
	    {
	        this.applianceIP = applianceIP;
	    }

	    
	    /**
	     * @return the response
	     */
	    public Response getResponse()
	    {
	        return response;
	    }

	    /**
	     * @param response the response to set
	     */
	    public void setResponse(final Response response)
	    {
	        this.response = response;
	    } 

	}



