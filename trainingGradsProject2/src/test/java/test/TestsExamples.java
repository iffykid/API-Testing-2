package test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestsExamples {

	@Test
	public void Test1() {
		
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.asString());
		
		
	}
	
	@Test
	public void Test2() {
		
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().body("data.id[0]", equalTo(7));
	}
}
