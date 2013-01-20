package pkg;

public class Name {
	private String firstName;
	private String surName;
	private NameFormatter formatter;
	
	public void setFormatter(NameFormatter _strategy){
		formatter = _strategy;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSurName() {
		return surName;
	}

	public String getFormattedName() {
		return formatter.format(this);
	}
}
