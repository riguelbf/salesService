package org.sales.service.factory;

import org.sales.service.entity.CustomerEntity;
import org.sales.service.specification.NotNullSpecification;

public class CustomerFactory extends CustomerEntity implements FactoryBase<CustomerEntity> {

	private static final long serialVersionUID = -3112476033619210711L;

	public CustomerFactory(String id, String cnpj, String name, String businessArea) {
		super(id, cnpj, name, businessArea);
	}

	@Override
	public void validateProperties() throws Exception {
		validateId(getId());
		validateCnpj(getCnpj());
		validateName(getName());
		validateBusinessArea(getBusinessArea());

	}

	private void validateBusinessArea(String businessArea) throws Exception {
		new NotNullSpecification().isSatisfy(businessArea);
	}

	private void validateName(String name) throws Exception {
		new NotNullSpecification().isSatisfy(name);
	}

	private void validateCnpj(String cnpj) throws Exception {
		new NotNullSpecification().isSatisfy(cnpj);
	}

	private void validateId(String id) throws Exception {
		new NotNullSpecification().isSatisfy(id);
	}

	@Override
	public CustomerEntity build() throws Exception {
		validateProperties();
		return (CustomerEntity) this;
	}

}
