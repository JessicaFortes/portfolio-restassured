package automacaoAPI;

import org.junit.Test;
import clients.APIClients;

import static specifications.validateSpacs.*;


public class ProductsTeste {

	@Test
	public void validateProductEndpointContract() {

		APIClients.getProducts().then().spec(validateApiProductContract());

	}

	@Test
	public void getListOfElectronicProducts() {

		APIClients.getProducts().then().spec(ValidateTheQuantityOfProductsElectronics());

	}

}
