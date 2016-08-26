package org.sales.service.factory;

import org.sales.service.entity.SalesManEntity;
import org.sales.service.specification.NotNullSpecification;

public class SalesManFactory extends SalesManEntity implements FactoryBase<SalesManEntity> {

	private static final long serialVersionUID = -49185649151148014L;

	public SalesManFactory(String id, Integer cpf, Long salary) {
		super(id, cpf, salary);
	}

	public SalesManEntity build() throws Exception {
		validateProperties();
		return (SalesManEntity) this;
	}

	@Override
	public void validateProperties() throws Exception {
		validateId(getId());
		validateCpf(getCpf());
		validateSalary(getSalary());
	}

	private void validateSalary(Long salary) throws Exception {
		new NotNullSpecification().isSatisfy(salary);
	}

	private void validateCpf(Integer cpf) throws Exception {
		new NotNullSpecification().isSatisfy(cpf);

	}

	private void validateId(String id) throws Exception {
		new NotNullSpecification().isSatisfy(id);
	}

}
