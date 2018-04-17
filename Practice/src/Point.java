
public class Point {

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
	
	
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	
	public Point move(Point p) {
		
		double a;
		double b;
		
		a = this.x+p.x;
		b = this.y+p.y;
		
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		return pnt;
		
		
	}
	
}
