package factory;

import entity.ItemEntity;

public class ItemFactory extends ItemEntity implements FactoryBase<ItemEntity> {

	private static final long serialVersionUID = 5654067714027751874L;
	
	public ItemFactory(String id, Integer quantity, Long price) {
		super(id, quantity, price);
	}
	
	@Override
	public void validateProperties() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemEntity build() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
