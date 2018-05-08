package method;

public class PracticeMethods {
	
	private String name;
	
	public String toString() {
		return "Byeon Serim";
	}
	public void print() {
		System.out.println("My name is "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = this.name;
		this.name = "Byeon Serim";
	}

	

}
