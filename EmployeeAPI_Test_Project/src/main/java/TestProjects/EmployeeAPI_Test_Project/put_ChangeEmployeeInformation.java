package TestProjects.EmployeeAPI_Test_Project;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class put_ChangeEmployeeInformation {

	JsonObject json = new JsonObject();
	JsonPath jsonresnponse;
	public void updateExistingEmployee(String name, String salary, String age, String id) {
		
		json.addProperty("name", name);
		json.addProperty("salary", salary);
		json.addProperty("age", age);

		RestAssured.baseURI="http://dummy.restapiexample.com";
		RestAssured.basePath= "/api/v1/update/"+id;
		
	jsonresnponse = new JsonPath(
			RestAssured
			.given()
			.when()
			.put()
			.asString());
			
	
	jsonresnponse.prettyPrint();// TODO Auto-generated method stub
		
	}

}
