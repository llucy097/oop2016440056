
public class Test {

	public static void main(String[] args) {
		
		Point p = new Point(); // ����Ʈ ��ü ���� �� ���۷��� p�� ����
		
		//��ü�� �ʵ� ����
	//	p.x = 1.0;
	//	p.y = 1.0; // -> ���� ���� ���� �Ұ�
		
		double temp = 1.0;
		
		
		p.setX(temp);//set : ������ (������ ���ο����� ���� ������ ���� �� �� �ִ�.)
		System.out.println("temp = "+ temp);
		
		
		
		
		p.setY(temp); //�����ڸ� ����� field�� ����
		System.out.println(p.getX()); // get : ������
	//	System.out.println(p.distance()); //p ��ü�� distance() �Լ� ȣ��

		
	}

}
