package domain.factory;

import org.junit.Assert;
import org.junit.Test;

import constant.MessageError;
import entity.CustomerEntity;
import factory.CustomerFactory;

public class CustomerFactoryTest {

	@Test
	public void must_build_entity() throws Exception {
		CustomerEntity entity = new CustomerFactory("10", "8076567543", "Test customer", "Electro").build();
		Assert.assertNotNull(entity);
	}

	@Test
	public void dont_must_build_entity_without_name() {
		CustomerEntity entity = null;
		String messageError = null;

		try {
			entity = new CustomerFactory("10", "8076567543", null, "Electro").build();
		} catch (Exception e) {
			messageError = e.getMessage();
		}

		Assert.assertNull(entity);
		Assert.assertNotNull(messageError);
		Assert.assertEquals(messageError, MessageError.MESSAGE_ERROR_NOTNULL);
	}
	
	@Test
	public void dont_must_build_entity_without_cnpj() {
		CustomerEntity entity = null;
		String messageError = null;

		try {
			entity = new CustomerFactory("10", null, "Test customer", "Electro").build();
		} catch (Exception e) {
			messageError = e.getMessage();
		}

		Assert.assertNull(entity);
		Assert.assertNotNull(messageError);
		Assert.assertEquals(messageError, MessageError.MESSAGE_ERROR_NOTNULL);
	}

}
