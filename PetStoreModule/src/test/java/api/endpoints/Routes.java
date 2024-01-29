package api.endpoints;

// Route class maintain all the Endpoint/URL.
public class Routes {
	
	public static String base_URL="https://petstore.swagger.io/v2";
	
	//User Module
	
	public static String post_URL=base_URL + "/store/order";
	public static String get_URL=base_URL +"/store/order/{orderId}";
	public static String delete_URL=base_URL +"/store/order/{orderId}";
	
	
}
