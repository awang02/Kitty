public class Kitty {
	// Fields
	private int age;
	private String name;

	// Constructors
	public Kitty () {
		name = "Mittens";
		age = 2;
	}
	
	public Kitty (String nameNew, int ageNew) {
		name = nameNew;
		age = ageNew;
	}
	
	// Methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void changeName(String newStr) {
		name = newStr;
	}
	public void makeOlder () {
		age += 1;
	}
	public String toString () {
		return "The amazing " + name + ".";
	}
}

