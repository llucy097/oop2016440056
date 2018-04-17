
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		
	}
	@Override // annotation : method overriding 한다는 것을 강조!
	public void sing() {
		System.out.println(name + " " + "야옹");
	}

}
