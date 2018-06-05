
public class Test {

	public static void main(String[] args) {
		
		Dog aDog= new Dog("Tina");
		Cat aCat = new Cat("Gaf");
		aDog.sing();
		aDog.playFetch();
		aCat.sing();
		
		System.out.println();
		
//		Upcasting
		Animal ADog = new Dog("TT");
		Animal ACat = new Cat("GG");
		ADog.sing();
//		ADog.playFetch(); error : Animal class에는 playFetch 메소드가 없다.
		ACat.sing();
		
		System.out.println();
		
//		Downcasting
		Dog gae = (Dog) ADog;
		gae.playFetch();
		((Dog) ADog).playFetch();  //위의 두 문장을 합쳐놓은 것과 같음! ->해당 문장에서만 downcasting됨
//		ADog.playFetch();  error : 여전히 안됨! 여전히 Animal
//		((Cat) ADog).playFetch(); error : Cat -> playFetch method 없음 (compile type error)
//		((Dog) ACat).playFetch(); error : run type error : compile에는 오류가 없음
//		Animal을 downcasting할 때 Cat 또는 Dog으로 할 수 있다.
//		Cat : Animal ->
		
		ACat = new Dog("Happy");
		((Dog) ACat).playFetch(); // ACat는 실제로 Dog 객체를 참조하고 있으므로 오류 발생하지 않음.
		ACat.sing();
		
//		Animal cat = new Cat("GA");
//		((Dog) cat).playFetch();  error : cat이 실제로 Cat 객체를 참조하고 있어서 오류 발생
		
		

		
	}

}
