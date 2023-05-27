package commonFunctionPackage;
import io.restassured.response.Response;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class API_Common_Function {
	public static int response_statusCode(String baseURI,String resource,String requestBody) {
		RestAssured.baseURI=baseURI;
		int statuscode =given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().statusCode();
		return statuscode;
		
	}
public static String responseBody(String baseURI,String resource,String requestBody)
{
	RestAssured.baseURI=baseURI;
 String  responseBody = given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().response().asString();
	
	return responseBody;
	

	
}
}
