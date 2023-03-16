package payroll;

class DataNotFoundException extends RuntimeException {

	DataNotFoundException(Long id) {
		super("Could not find data " + id);
	}
}
