package specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.specification.ResponseSpecification;

import static org.apache.http.HttpStatus.*;
import static org.hamcrest.Matchers.hasSize;

public class validateSpacs {

	public static ResponseSpecification validateApiProductContract() {
		return new ResponseSpecBuilder().expectStatusCode(SC_OK)
				.expectBody(JsonSchemaValidator.matchesJsonSchemaInClasspath("productSchema.json")).build();
	}

	public static ResponseSpecification ValidateTheQuantityOfProductsElectronics() {
		return new ResponseSpecBuilder().expectStatusCode(SC_OK)
				.expectBody("findAll { it.category == 'electronics' }", hasSize(6)).build();
	}

}
