import java.awt.Point;
import java.util.Scanner

public class CartesianPoint {

	   //Instance variables: 2���� �� (double)
		private double x;
		private double y;
		
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		
		
	    //Constructors
		public double Constructors() {
			double result;
			result = Math.sqrt((0.0-this.x)*(0.0-this.x)+(0.0-this.y)*(0.0-this.y));
			
		}
		
	    //default constructor: ����(0,0)���� ����
			

		
	    //2 argument constructor: ��ǥ�� ���� �Է�
		
		

	    //Methods

	    //method1: addPoint()
		public CartesianPoint addPoint(Point p) {
			double a;
			double b;
			
			a = this.x+p.x;
			b = this.y+p.y;
			
			Point pnt = new Point ();
			pnt.x = a;
			pnt.y = b;
			
			return pnt;
			
			
		}

	    //�Է�: ���� ����Ʈ(CartesianPoint)

	    //���: ���� ����Ʈ(CartesianPoint)

	    //method2: toString()

	    //�Է�: ����

	    //���: ����

	    //�μ�ǥ��: �� ����Ʈ��ü�� ��ǥ�� "x=???, y=???"�� ȭ�鿡 ���

	
	
}
