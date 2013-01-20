package version1;

public class NameSaver implements Observer{

	@Override
	public void update(String name) {
		System.out.print("Saving name "+name+" to storage");
		Storage.name = name;
	}
}
