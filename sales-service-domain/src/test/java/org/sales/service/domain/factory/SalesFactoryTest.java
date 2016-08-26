package org.sales.service.domain.factory;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.sales.service.constant.MessageError;
import org.sales.service.domain.dataprovider.ItemDataProvider;
import org.sales.service.entity.ItemEntity;
import org.sales.service.entity.SaleEntity;
import org.sales.service.factory.SaleFactory;

public class SalesFactoryTest {

	private List<ItemEntity> items;

	public SalesFactoryTest() {
		items = new ItemDataProvider().buildList();
	}

	@Test
	public void must_build_entity() throws Exception {
		SaleEntity entity = new SaleFactory("001","Test sale man",items).build();
		Assert.assertNotNull(entity);
	}

	@Test
	public void dont_must_build_entity_with_list_empty() {
		SaleEntity entity = null;
		String messageError = null;

		try {
			entity = new SaleFactory("001","Test sale man",null).build();
		} catch (Exception e) {
			messageError = e.getMessage();
		}

		Assert.assertNull(entity);
		Assert.assertNotNull(messageError);
		Assert.assertEquals(messageError, MessageError.MESSAGE_ERROR_LIST_NOTNULL);
	}

}
