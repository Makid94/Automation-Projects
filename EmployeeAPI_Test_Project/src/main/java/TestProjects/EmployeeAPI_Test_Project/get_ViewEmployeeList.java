package TestProjects.EmployeeAPI_Test_Project;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class get_ViewEmployeeList {
	
	public get_ViewEmployeeList(){
		
	}

	JsonObject json = new JsonObject();
	JsonPath jsonResponse;
	
	
	public void getEmployeeList() {
	
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		RestAssured.basePath = "/api/v1/employees";
		
		jsonResponse = new JsonPath(
				RestAssured.given().when().get().asString());
				
				
		jsonResponse.prettyPrint();
				
				
				
				
				
				
	}

}
