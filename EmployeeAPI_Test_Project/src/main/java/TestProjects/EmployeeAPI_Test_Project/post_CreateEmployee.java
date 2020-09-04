package TestProjects.EmployeeAPI_Test_Project;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class post_CreateEmployee {
	
	
	JsonObject json = new JsonObject();
	JsonPath jsonResponse;

	public void CreateNewEmployee(String name, String salary, String age) {
		
		
		
		
		json.addProperty("name", name);
		json.addProperty("salary", salary);
		json.addProperty("age", age);
		
		RestAssured.baseURI="http://dummy.restapiexample.com";
		RestAssured.basePath="api/v1/create";
		
		jsonResponse = new JsonPath(
				RestAssured
				.given()
				.contentType("application/json")
				.body(json.toString()).log().all()
				.when()
				.post()
				.asString());
				
				jsonResponse.prettyPrint();
				
			
		
	}
	
	public String getEmployeeID() {
		return jsonResponse.getString("id");
		
	}
	
	public String getEmployeeName() {
		return jsonResponse.getString("name");
		
	}

}
