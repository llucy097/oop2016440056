
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0));
		//Math.cos() : ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ� = static methods
		
		//static method ���
		Car.print();
		
		
		System.out.println(Car.numberOfCars);
		// ���������� "Ŭ�󽺸�.����������"���ε� ���� �����ϴ�.
		
		Car myCar = new Car("Space Blue", 300);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
		// myCar.print();
		
		System.out.println(myCar);
		System.out.println(myCar.numberOfCars);
		
		Car yourCar = new Car();
		//���� ���� : ���α׷��Ӱ� �����ڸ� ����� ���� java���� �����ڸ� ��������� ����.
		//�Ű������� ������ ������ �ٽ� ������ ��.
		// method�� 
		// public Car() {}�� ������ָ� ���� �ذ�!!
		System.out.println(yourCar);
		System.out.println(yourCar.numberOfCars);
		
		
		
//		Car Car3 = new Car("Red");
//		System.out.println(Car3);
		myCar.print();
		
		
		
		
	}

}
