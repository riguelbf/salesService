package org.sales.service.specification;

import org.sales.service.constant.MessageError;

public class NotNullSpecification extends RuntimeException implements SpecificationBase {

	private static final long serialVersionUID = 9155194858073701907L;

	@Override
	public void isSatisfy(Object value) throws Exception {
		if(value == null){
			throw new Exception(MessageError.MESSAGE_ERROR_NOTNULL);	
		}
	}

}
