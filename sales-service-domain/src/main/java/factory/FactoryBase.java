package factory;

import entity.EntityBase;

public interface FactoryBase<T extends EntityBase> {

	void validateProperties() throws Exception;
	
	T build() throws Exception;
}
