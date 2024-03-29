package api.endpoints;

import static io.restassured.RestAssured.given;
import api.payload.User;
import io.restassured.response.*;

public class UserEndPoints {
	
	public static Response createUser(User payload)
	{
		Response response=given()
			.contentType("application/json")
			.accept("application/json")
			.body(payload)
		.when()
			.post(Routes.post_URL);
		
		return response;
	}
	
	
	public static Response readUser(String userName)
	{
		Response response=given()
			.pathParam("username",userName)
		.when()
			.get(Routes.get_URL);
		
		return response;
	}
	
	
	public static Response updateUser(User payload, String userName)
	{
		Response response=given()
			.contentType("application/json")
			.accept("application/json")
			.pathParam("username",userName)
			.body(payload)
		.when()
			.put(Routes.put_URL);
		
		return response;
	}
	
	
	public static Response deleteUser(String userName)
	{
		Response response=given()
			.pathParam("username",userName)
		.when()
			.delete(Routes.delete_URL);
		
		return response;
	}
	

}
