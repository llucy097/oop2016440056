
public class Car {
	
	//Fields
	private String color;
	private int speed;
	
	public static int numberOfCars = 0; 
	//static field(=Ŭ���� ����, ��������) : Ŭ������ �� �ϳ��� �ִ� ����
	//���� public/private static ...
	
	
	
	
	//Constructor (������)
	// �޼ҵ� �̸��� Ŭ���� �̸��� ���ƾ� ��!!
	// ��ȯ���� ����
	// ���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� java�� �ڵ����� ������ �ش�.
	// ������ �����ڸ� �ϳ��� �����ϸ� java�� �ƹ��ϵ� ���� �ʴ´�.
	// argument ���� �� ������ ���α׷��Ӱ� ��� å������ �Ѵ�.
	// default value 
	public Car(String color, int speed) {
		this.color = color; //�ʵ� color / �Ű�����color
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
	//	this(color, 0);//constructor�� ���� �θ� �� �ִ�.
	// }
	
	
	//methods
	
	// static methods �����
	public static void print() {
		//System.out.println(this.color + ", " + this.speed);
		//���� ���� : static methods�� Ư�� ��ü�� ������ �� ����
		// this. <- ��ü ���� ���
		// ���� �޼ҵ忡���� ���� ������ ���� ����
		
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
