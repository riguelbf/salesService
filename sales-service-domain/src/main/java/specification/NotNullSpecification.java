package specification;

public class NotNullSpecification extends RuntimeException implements SpecificationBase {

	private static final long serialVersionUID = 9155194858073701907L;

	@Override
	public void isSatisfy(Object value) throws Exception {
		if(value == null){
			throw new Exception("Value can not null!");	
		}
	}

}
