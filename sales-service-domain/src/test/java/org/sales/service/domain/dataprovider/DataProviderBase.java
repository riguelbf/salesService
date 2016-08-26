package org.sales.service.domain.dataprovider;

import java.util.List;

import org.sales.service.entity.EntityBase;

public interface DataProviderBase<T extends EntityBase> {

	public T build();
	
	public List<T> buildList();
}
