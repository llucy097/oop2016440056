
public class TestPoint {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		//x��ǥ, y��ǥ ����
		double temp1 = 1.0;
		double temp2 = 2.0;
		
		p.setX(temp1);
		p.setY(temp2);
		
		
		//��ǥ ���
		System.out.println("("+p.getX()+", " + p.getY() + ")");
		

		//���� �� ���� ���
		System.out.println(p.distance());
		
	
		
		
		
	}

}
