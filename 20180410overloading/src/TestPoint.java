
public class TestPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point (); //class�� Point�� ��ü ����
		pnt1.setX(1.0);
		pnt1.setY(1.0);
		
		Point pnt2 = new Point (); //class�� Point�� ��ü ����
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		
		//pnt1.print(); //��ü�� ���� �޼ҵ尡 �ҷ���
		//pnt2.print();
		//System.out.println(pnt.getX() + ", " + pnt.getY());
		
//		String str = pnt1.toString();
//		System.out.println(str);
		System.out.println(pnt1);
		System.out.println(pnt2);
		
		
		//distance
		System.out.println(pnt1.distance());
		System.out.println(pnt2.distance());
		//method overloading : �޼ҵ� �̸��� ����������, �Ű������� ȣ���� �޼ҵ带 ������ �� �ִ�.
		System.out.println(pnt2.distance(pnt1));
		
	}

}
