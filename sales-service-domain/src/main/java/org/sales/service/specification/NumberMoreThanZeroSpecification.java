package org.sales.service.specification;

import org.sales.service.constant.MessageError;

public class NumberMoreThanZeroSpecification extends RuntimeException implements SpecificationBase {

	private static final long serialVersionUID = 1664669400755324220L;

	@Override
	public void isSatisfy(Object value) throws Exception {

		Long number = (Long) value;
		if (number < 0) {
			throw new Exception(MessageError.MESSAGE_ERROR_NUMBER_MORE_THAN_ZERO);
		}

	}

}
