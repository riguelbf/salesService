package specification;

public class NumberMoreThanZeroSpecification extends RuntimeException implements SpecificationBase {

	private static final long serialVersionUID = 1664669400755324220L;

	@Override
	public void isSatisfy(Object value) throws Exception {

		Long number = (Long) value;
		if (number < 0) {
			throw new Exception("Value must be greater than zero!");
		}

	}

}
