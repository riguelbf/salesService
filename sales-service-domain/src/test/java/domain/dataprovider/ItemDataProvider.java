package domain.dataprovider;

import java.util.ArrayList;
import java.util.List;

import entity.ItemEntity;
import factory.ItemFactory;

public class ItemDataProvider implements DataProviderBase<ItemEntity> {

	@Override
	public ItemEntity build() {
		return new ItemFactory("020", 55, (long) 55.43);
	}

	@SuppressWarnings("serial")
	@Override
	public List<ItemEntity> buildList() {
		return new ArrayList<ItemEntity>() {
			{
				add(new ItemFactory("020", 55, (long) 556.43));
				add(new ItemFactory("034", 23, (long) 25.43));
				add(new ItemFactory("050", 76, (long) 34.33));
				add(new ItemFactory("021", 900, (long) 87.53));
				add(new ItemFactory("007", 654, (long) 12.93));
			}
		};
	}

}
