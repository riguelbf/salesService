package factory;

import entity.SalesManEntity;
import specification.NotNullSpecification;

public class SalesManFactory extends SalesManEntity implements FactoryBase {

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
