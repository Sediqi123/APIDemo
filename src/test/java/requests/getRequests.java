package requests;
import static io.restassured.RestAssured.given;
public class getRequests {
	
	public static void main(String[] args) {
		
		String id = "1575";
		String endPoint = "https://hr-sit.noortecktraining.com/employee/one";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIwMiwidXNlcm5hbWUiOiJTZWRpcWkxIiwiaWF0IjoxNzAwNzU5OTU0LCJleHAiOjE3MDA4NDYzNTR9.CcWlBbXaXr4faSs0fuCC_jY7yM1Fg3a2N6ghbRf3tsU";
		
		
		Response response;
		
		response = given()
				
				.header("Authorization",token)
				.queryParam("id",id)
				
				
				.when()
				.get(endPoint)
				
				.then()
				.extract()
				.response();
		
		response.pretyPriont();
		
		int code = response.getstatuscode();
		
		System.out.println(code);
		
		JsonPath jsonpath = response.jsonpath();
		
		String firstName = jsonpath.getString("first_name");
		

		
		
		
	}

}
