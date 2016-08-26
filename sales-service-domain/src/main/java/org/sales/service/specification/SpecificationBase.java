package org.sales.service.specification;

import java.io.Serializable;

public interface SpecificationBase  extends Serializable{

	void isSatisfy(Object value) throws Exception;
}
