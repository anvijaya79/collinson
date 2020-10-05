 Feature: Test the CityBike API
 
 Scenario Outline: Verify city,latitude and longitude
 Given I get <url> the exact location of city bikes 
 And verify the <response_code>
 When I read the location data <data_filter> and verify that <city> is in <country_code>
 Then I check the latitude and longitude
   
 # @ScenarioDescription:The test case will verify the location data has the correct city for the given country and values for latitude and longitude
 @1 @REST 
 Scenarios: Verify city Frankfurt is in Germany and has values for latitude and longitude
 | UseCaseId | TestcaseTitle                                                                 | url                     | response_code | data_filter        | country_code | city|
 | "1"       | "Verify city Frankfurt is in Germany and has values for latitude and longitude"| "http://api.citybik.es"| 200           | "networks.location"|  "country=DE"|  "city=Frankfurt"|      
      