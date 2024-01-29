package api.endpoints;

import static io.restassured.RestAssured.given;
import api.payload.Store;
import io.restassured.response.*;

public class StoreEndPoints {
	
	public static Response CreateOrder(Store payload) {
		
		Response response=given()
			.accept("application/json")
			.contentType("application/json")
			.body(payload)
		
		.when()
			.post(Routes.post_URL);
				
		return response;
		
	}
	
    public static Response ReadOrder(Integer ID) {
		
		Response response=given()
			.accept("application/json")
			.pathParam("orderId",ID)
		
		.when()
			.get(Routes.get_URL);
		
		
		return response;
		
	}
    
 public static Response DeleteOrder(Integer ID) {
		
		Response response=given()
			.accept("application/json")
			.pathParam("orderId",ID)		
		.when()
			.delete(Routes.delete_URL);
		
		
		return response;
		
	}
    
	
	

}
