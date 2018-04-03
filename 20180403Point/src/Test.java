
public class Test {

	public static void main(String[] args) {
		
		Point p = new Point(); // 포인트 객체 생성 및 레퍼런스 p에 저장
		
		//객체의 필드 접근
	//	p.x = 1.0;
	//	p.y = 1.0; // -> 값의 범위 제한 불가
		
		double temp = 1.0;
		
		
		p.setX(temp);//set : 설정자 (설정자 내부에서는 값의 범위도 제한 할 수 있다.)
		System.out.println("temp = "+ temp);
		
		
		
		
		p.setY(temp); //접근자를 사용한 field값 설정
		System.out.println(p.getX()); // get : 접근자
	//	System.out.println(p.distance()); //p 객체의 distance() 함수 호출

		
	}

}
