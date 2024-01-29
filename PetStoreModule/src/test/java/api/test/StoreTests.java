package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.StoreEndPoints;
import api.payload.Store;
import io.restassured.response.*;

public class StoreTests {
	
	Faker faker =new Faker();
	Store storePayload=new Store();
	
	@BeforeClass
	public void setUpData() {
		
		storePayload.setId(faker.idNumber().hashCode());
		storePayload.setPetId(faker.number().randomDigit());
		storePayload.setQuantity(faker.number().randomDigit());
		storePayload.setShipDate("2024-01-28T16:10:17.101+0000");
		storePayload.setStatus("Placed");
		storePayload.setComplete(faker.bool().bool());
		
	}
	
	
	 @Test
	 public void testPostOrder() {
	 
	 Response response=StoreEndPoints.CreateOrder(storePayload);
	 Assert.assertEquals(response.getStatusCode(),200);
	 
	  }
	 
	
	@Test
	public void testGetOrderByID() {
		
		Response response=StoreEndPoints.ReadOrder(storePayload.getPetId());
		Assert.assertEquals(response.getStatusCode(),200);	
	}
	
	
	 @Test 
	 public void testDeleteOrderByID() {
	 
	 Response response=StoreEndPoints.DeleteOrder(storePayload.getId());
	 Assert.assertEquals(response.getStatusCode(),200); }
	
	
}
