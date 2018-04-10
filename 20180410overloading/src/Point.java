
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	public String toString() {
		return ("(" + this.x + ", " + this.y +")");
		//toString은 무조건 string으로 return 해야 함
		
		//return ("(" + toString(this.x) + ", " + this.y +")"); 
		//->오류 : this.x : primitive type이기 때문에 오류 해결 방법 : primitive type double을 reference type double로 바꿔야 함
		// reference type으로 바꿔주는 tool을 사용해야 함
		// toString(new Double(this.x)) (?) wraping function을 이용하여 객체 type로 변경 = boxing
	}
	
	public void print() {
		//System.out.println(this.getX() + ", " + this.getY()); //클래스에 있는 다른 메소드를 부르는 방법
		System.out.println(getX() + ", " + getY());
		//System.out.println(this.x + ", " + this.y);
	}

	//원점-점 사이의 거리
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	
	
	//점-점 사이의 거리
	//method overloading : 동일한 method 이름이지만 매개변수에 다라 완전히 다른 method 취급
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
