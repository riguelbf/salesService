package domain.dataprovider;

import java.util.List;

import entity.EntityBase;

public interface DataProviderBase<T extends EntityBase> {

	public T build();
	
	public List<T> buildList();
}
