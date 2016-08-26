package factory;

import entity.SalesManEntity;

public class SalesManFactory extends SalesManEntity implements FactoryBase {

	private static final long serialVersionUID = -49185649151148014L;

	protected SalesManFactory(String id, Integer cpf, Long salary) {
		super(id, cpf, salary);
	}

	public SalesManEntity build(String id, Integer cpf, Long salary) {
		validateProperties();

		return (SalesManEntity) this;
	}

	@Override
	public void validateProperties() {
		validateId(getId());
		validateCpf(getCpf());
		validateSalary(getSalary());

	}

	private void validateSalary(Long salary) {
		// TODO Auto-generated method stub
		
	}

	private void validateCpf(Integer cpf) {
		// TODO Auto-generated method stub
		
	}

	private void validateId(String id) {
		// TODO Auto-generated method stub
		
	}

}
