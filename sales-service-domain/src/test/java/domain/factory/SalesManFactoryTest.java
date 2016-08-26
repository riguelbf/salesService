package domain.factory;

import org.junit.Assert;
import org.junit.Test;

import constant.MessageError;
import entity.SalesManEntity;
import factory.SalesManFactory;

public class SalesManFactoryTest {

	@Test
	public void must_build_entity() throws Exception {
		SalesManEntity entity = new SalesManFactory("002", 10, 2000L).build();
		Assert.assertNotNull(entity);
	}

	@Test
	public void dont_must_build_entity() {
		SalesManEntity entity = null;
		String messageError = null;

		try {
			entity = new SalesManFactory(null, 10, 2000L).build();
		} catch (Exception e) {
			messageError = e.getMessage();
		}

		Assert.assertNull(entity);
		Assert.assertNotNull(messageError);
		Assert.assertEquals(messageError, MessageError.MESSAGE_ERROR_NOTNULL);
	}

}
