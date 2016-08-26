package org.sales.service.factory;

import java.util.List;

import org.sales.service.entity.ItemEntity;
import org.sales.service.entity.SaleEntity;
import org.sales.service.specification.ListNotEmptySpecification;
import org.sales.service.specification.NotNullSpecification;

public class SaleFactory extends SaleEntity implements FactoryBase<SaleEntity> {

	private static final long serialVersionUID = -8074879445846928881L;

	public SaleFactory(String id, String salesmanName, List<ItemEntity> items) {
		super(id, salesmanName, items);
	}

	@Override
	public void validateProperties() throws Exception {
		validateId(getId());
		validateSalesManName(getSalesmanName());
		validateItems(getItems());
	}

	private void validateItems(List<ItemEntity> items) throws Exception {
		new ListNotEmptySpecification().isSatisfy(items);
	}

	private void validateSalesManName(String salesmanName) throws Exception {
		new NotNullSpecification().isSatisfy(salesmanName);
	}

	private void validateId(String id) throws Exception {
		new NotNullSpecification().isSatisfy(id);
	}

	@Override
	public SaleEntity build() throws Exception {
		validateProperties();
		return (SaleEntity) this;
	}

}
