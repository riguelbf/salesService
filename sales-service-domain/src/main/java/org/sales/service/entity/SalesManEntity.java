package org.sales.service.entity;

public class SalesManEntity extends EntityBase {

	private static final long serialVersionUID = 7081065877396959557L;

	private Integer cpf;

	private Long salary;

	protected SalesManEntity(String id,Integer cpf, Long salary){
		setId(id);
		setCpf(cpf);
		setSalary(salary);
	}
	
	public Integer getCpf() {
		return cpf;
	}

	private void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Long getSalary() {
		return salary;
	}

	private void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesManEntity other = (SalesManEntity) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

}
