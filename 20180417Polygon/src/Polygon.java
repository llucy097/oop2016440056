
public abstract class Polygon { //abstract class : 객체를 만들 수 없음
	//공통된 property만 모아서 superclass로 만듬, 객체 필요 없음
	// abstract : 추상화
	
	// field를 만들 수 있음
	public double height;
	public double width;
	
	public abstract double area();
	// abstract methods : 구현X 클라스를 상속받으면 반드시 메소드를 구현해야 함
}

	