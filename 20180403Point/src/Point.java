
public class Point {
	// �ʵ�(field)�� scope(��ȿ����) = Ŭ���� ����
	public double x; //
	public double y;
	
	public double distance() {
		//��ȯ�� ���� ����
		double result; //�������� : method �ȿ����� result��� ���� �̸��� ��ȿ��
		// ���������� ��ȿ������ �޼ҵ� ����
		
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
	
	
	public Point move(Point p) {// �Ű� ���� p�� ��ȿ������ �޼ҵ� ����
		//���ο� ����Ʈ�� ��ȯ
		
		//temp ���� ����
		double a;
		double b;
		
		// ����Ʈ p��ŭ �̵�
		a = this.x + p.x; //x�� field�� ������ x���� �����ϰ� ���� ��
		b = this.y + p.y;
		
		// ���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		// ���ο� ����Ʈ ��ȯ
		return pnt;
	}
	
		
	
	}
	
	
	
