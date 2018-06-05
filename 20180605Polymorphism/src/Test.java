
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
//		ADog.playFetch(); error : Animal class���� playFetch �޼ҵ尡 ����.
		ACat.sing();
		
		System.out.println();
		
//		Downcasting
		Dog gae = (Dog) ADog;
		gae.playFetch();
		((Dog) ADog).playFetch();  //���� �� ������ ���ĳ��� �Ͱ� ����! ->�ش� ���忡���� downcasting��
//		ADog.playFetch();  error : ������ �ȵ�! ������ Animal
//		((Cat) ADog).playFetch(); error : Cat -> playFetch method ���� (compile type error)
//		((Dog) ACat).playFetch(); error : run type error : compile���� ������ ����
//		Animal�� downcasting�� �� Cat �Ǵ� Dog���� �� �� �ִ�.
//		Cat : Animal ->
		
		ACat = new Dog("Happy");
		((Dog) ACat).playFetch(); // ACat�� ������ Dog ��ü�� �����ϰ� �����Ƿ� ���� �߻����� ����.
		ACat.sing();
		
//		Animal cat = new Cat("GA");
//		((Dog) cat).playFetch();  error : cat�� ������ Cat ��ü�� �����ϰ� �־ ���� �߻�
		
		

		
	}

}
