
public class CartesianPoint {

	//fields
	private double x;
	private double y;
	
	//Constructors
	public CartesianPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//default constructor
	public CartesianPoint() {
		this.x = 0.0;
		this.y = 0.0;
	}

	//Methods
	//method1 : addPoint()
	public void addPoint() {
		double x = this.x + getX();
		double y = this.y + getY();
	
	}
	
	public String toString() {
		return ("x = " + this.x + ", " + "y = " + this.y);
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
