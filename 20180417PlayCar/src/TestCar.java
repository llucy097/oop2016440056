
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0));
		//Math.cos() : 객체를 생성하지 않고 사용할 수 있는 메소드 = static methods
		
		//static method 출력
		Car.print();
		
		
		System.out.println(Car.numberOfCars);
		// 정적변수는 "클라스명.정적변수명"으로도 접근 가능하다.
		
		Car myCar = new Car("Space Blue", 300);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
		// myCar.print();
		
		System.out.println(myCar);
		System.out.println(myCar.numberOfCars);
		
		Car yourCar = new Car();
		//에러 원인 : 프로그래머가 생성자를 만드는 순간 java에서 생성자를 만들어주지 않음.
		//매개변수를 포함한 생성자 다시 만들어야 함.
		// method로 
		// public Car() {}를 만들어주면 에러 해결!!
		System.out.println(yourCar);
		System.out.println(yourCar.numberOfCars);
		
		
		
//		Car Car3 = new Car("Red");
//		System.out.println(Car3);
		myCar.print();
		
		
		
		
	}

}
