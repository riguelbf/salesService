package org.sales.service.factory;

import org.sales.service.entity.EntityBase;

public interface FactoryBase<T extends EntityBase> {

	void validateProperties() throws Exception;
	
	T build() throws Exception;
}
