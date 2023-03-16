package galina;

class ObservNotFoundException extends RuntimeException {

	ObservNotFoundException(Long id) {
		super("Could not find observ " + id);
	}
}
