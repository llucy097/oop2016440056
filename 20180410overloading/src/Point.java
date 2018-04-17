
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	public String toString() {
		return ("(" + this.x + ", " + this.y +")");
		//toString�� ������ string���� return �ؾ� ��
		
		//return ("(" + toString(this.x) + ", " + this.y +")"); 
		//->���� : this.x : primitive type�̱� ������ ���� �ذ� ��� : 
		//primitive type double�� reference type double�� �ٲ�� ��
		// reference type���� �ٲ��ִ� tool�� ����ؾ� ��
		// toString(new Double(this.x))
		// (?) wraping function�� �̿��Ͽ� ��ü type�� ���� = boxing
	}
	
	public void print() {
		//System.out.println(this.getX() + ", " + this.getY()); 
		//Ŭ������ �ִ� �ٸ� �޼ҵ带 �θ��� ���
		System.out.println(getX() + ", " + getY());
		//System.out.println(this.x + ", " + this.y);
	}

	//����-�� ������ �Ÿ�
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	
	
	//��-�� ������ �Ÿ�
	//method overloading : ������ method �̸������� �Ű������� �ٶ� ������ �ٸ� method ���
	public double distance(Point p) {
		return Math.sqrt( (this.x-p.getX()) * (this.x-p.getX()) + (this.y-p.getY()) * (this.x-p.getY()) );
	}
	
	
	
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
	
	

}
