
public class Chien {
	private int age;
	private String name;
	private boolean grand;
	
	static int ageMaxi;
	
	public void setAge(int nouvelAge) {
		age = nouvelAge;
		nouvelAge = 1;
	}

	// getters et setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGrand() {
		return grand;
	}

	public void setGrand(boolean grand) {
		this.grand = grand;
	}

	public int getAge() {
		return age;
	}
	
	
}
