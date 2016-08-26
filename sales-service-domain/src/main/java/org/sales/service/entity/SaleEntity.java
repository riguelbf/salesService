package org.sales.service.entity;

import java.util.List;

public class SaleEntity extends EntityBase {

	private static final long serialVersionUID = -8563015234542051715L;

	private List<ItemEntity> items;

	private String salesmanName;

	protected SaleEntity(String id, String salesmanName, List<ItemEntity> items){
		setId(id);
		setSalesmanName(salesmanName);
		setItems(items);
	}
	
	public List<ItemEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemEntity> items) {
		this.items = items;
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((salesmanName == null) ? 0 : salesmanName.hashCode());
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
		SaleEntity other = (SaleEntity) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (salesmanName == null) {
			if (other.salesmanName != null)
				return false;
		} else if (!salesmanName.equals(other.salesmanName))
			return false;
		return true;
	}

}
