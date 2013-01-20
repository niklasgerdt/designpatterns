package pkg;

public class SurNameFirstNameFormatter implements NameFormatter{

	@Override
	public String format(Name _personName) {
		return _personName.getSurName()+", "+_personName.getFirstName();
	}
}
