
public class TestPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point (); //class가 Point인 객체 생성
		pnt1.setX(1.0);
		pnt1.setY(1.0);
		
		Point pnt2 = new Point (); //class가 Point인 객체 생성
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		
		//pnt1.print(); //객체에 대해 메소드가 불려짐
		//pnt2.print();
		//System.out.println(pnt.getX() + ", " + pnt.getY());
		
//		String str = pnt1.toString();
//		System.out.println(str);
		System.out.println(pnt1);
		System.out.println(pnt2);
		
		
		//distance
		System.out.println(pnt1.distance());
		System.out.println(pnt2.distance());
		//method overloading : 메소드 이름은 동일하지만, 매개변수로 호출할 메소드를 구분할 수 있다.
		System.out.println(pnt2.distance(pnt1));
		
	}

}
