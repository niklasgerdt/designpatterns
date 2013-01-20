package pkg;

public class FirstNameSurNameFormatter implements NameFormatter {

	@Override
	public String format(Name _personName) {
		return _personName.getFirstName()+", "+_personName.getSurName();
	}
}
