package org.sales.service.specification;

import java.util.List;

import org.sales.service.constant.MessageError;

public class ListNotEmptySpecification extends RuntimeException implements SpecificationBase {

	private static final long serialVersionUID = 9155194858073701907L;

	@Override
	public void isSatisfy(Object value) throws Exception {
		if(value == null || ((List<?>)value).isEmpty()){
			throw new Exception(MessageError.MESSAGE_ERROR_LIST_NOTNULL);	
		}
	}

}
