package api.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import api.endpoints.StoreEndPoints;
import api.payload.Store;
import api.utilities.SheetsQuickstart;
import io.restassured.response.Response;

public class DDTests {
	
	@Test(priority=1, dataProvider="userID", dataProviderClass=SheetsQuickstart.class )
	public void testDeleteOrderByID(Object userID)
	{
		Store storePayload=new Store();
		
		storePayload.setId(Integer.parseInt(userID.toString()));
		
		
		Response response=StoreEndPoints.DeleteOrder(storePayload.getId());
		Assert.assertEquals(response.getStatusCode(),404);
			
	}

}
