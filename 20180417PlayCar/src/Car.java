
public class Car {
	
	//Fields
	private String color;
	private int speed;
	
	public static int numberOfCars = 0; 
	//static field(=클래스 변수, 정적변수) : 클래스에 딱 하나만 있는 변수
	//형태 public/private static ...
	
	
	
	
	//Constructor (생성자)
	// 메소드 이름과 클래스 이름과 같아야 함!!
	// 반환형이 없다
	// 만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 java가 자동으로 생성해 준다.
	// 하지만 생성자를 하나라도 정의하면 java는 아무일도 하지 않는다.
	// argument 없는 것 까지도 프로그래머가 모두 책임져야 한다.
	// default value 
	public Car(String color, int speed) {
		this.color = color; //필드 color / 매개변수color
		this.speed = speed;
		
		numberOfCars++;
		
	}
	
	// default
	public Car() {
		this.color = "White";
		this.speed = 60;
		
		numberOfCars++;
		
	}
	
	// this()
	// public Car(String color) {
	//	this(color, 0);//constructor를 곧장 부를 수 있다.
	// }
	
	
	//methods
	
	// static methods 만들기
	public static void print() {
		//System.out.println(this.color + ", " + this.speed);
		//에러 원인 : static methods는 특정 객체로 접근할 수 없음
		// this. <- 객체 접근 방법
		// 정적 메소드에서는 정적 변수만 접근 가능
		
		System.out.println(numberOfCars);
	}
	
	public String toString() {
		return ("Color is "+this.color+". "+"Speed is "+ this.speed+".");
	}
	
	
	

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
