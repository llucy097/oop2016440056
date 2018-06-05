
public class TestAnimalSing {

	public static void main(String[] args) {
		
		AnimalSing as = new AnimalSing();
		
		as.add(new Dog("Tina"));
		as.add(new Dog("Happy"));
		as.add(new Dog("Mint"));
		as.add(new Dog("Dory"));
		
		as.add(new Cat("Lulu"));
		as.add(new Cat("Nemo"));
		as.add(new Cat("Nabi"));
		as.add(new Cat("Geongong"));
		
		as.sing();
		


	}

}
