package api.endpoints;

// Route class maintain all the EndPoint/URL.

public class Routes {
	
	public static String base_URL="https://petstore.swagger.io/v2";
	
	//USER MODULE
	
	public static String post_URL= base_URL+"/user";
	public static String get_URL= base_URL+"/user/{username}";
	public static String put_URL= base_URL+"/user/{username}";
	public static String delete_URL= base_URL+"/user/{username}";
	
	

}
