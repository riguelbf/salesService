package domain.factory;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import constant.MessageError;
import domain.dataprovider.ItemDataProvider;
import entity.ItemEntity;
import entity.SaleEntity;
import factory.SaleFactory;

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
