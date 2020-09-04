package TestProjects.EmployeeAPI_Test_Project;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class get_ViewSingleEmployeeDetail {

	

	JsonObject json = new JsonObject();
	JsonPath jsonresponse;
	
	
	public void viewingEmployeeDetail(String id) {
		
		RestAssured.baseURI="http://dummy.restapiexample.com";
		RestAssured.basePath="/employee/"+id;
		
		jsonresponse=new JsonPath(
				RestAssured
				.given()
				.when()
				.get()
				.asString());
				
		jsonresponse.prettyPrint();
				
				
		
	}

}
