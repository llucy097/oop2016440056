
public class Point {
	// 필드(field)의 scope(유효범위) = 클래스 내부
	private double x; //
	private double y;
	
	public void setX(double xx) { // mutator : 설정자
		this.x = xx;
		xx = 100.0;
	}
	
	public void setY(double yy) {
		this.y = yy;
	}
	
	public double getX() { //assessor : 접근자
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance() {
		//반환할 변수 선언
		double result; //지역변수 : method 안에서만 result라는 변수 이름이 유효함
		// 지역변수의 유효범위는 메소드 내부
		
		
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		
		//거리 반환
		return result;
	}
	
	
	public Point move(Point p) {// 매개 변수 p의 유효범위는 메소드 내부
		//새로운 포인트를 반환
		
		//temp 변수 선언
		double a;
		double b;
		
		// 포인트 p만큼 이동
		a = this.x + p.x; //x가 field로 정의한 x임을 강조하고 싶을 때
		b = this.y + p.y;
		
		// 새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		// 새로운 포인트 반환
		return pnt;
	}
	
		
	
	}
	
	
	
