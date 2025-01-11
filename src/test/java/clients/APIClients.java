package clients;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static enums.Endpoints.API_PRODUCTS;

public class APIClients {

	public static Response getProducts() {
		return given().when().get(API_PRODUCTS.getResource());
	}
}
