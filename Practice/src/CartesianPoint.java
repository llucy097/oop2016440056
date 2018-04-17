import java.awt.Point;
import java.util.Scanner

public class CartesianPoint {

	   //Instance variables: 2차원 점 (double)
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
		
	    //default constructor: 원점(0,0)으로 설정
			

		
	    //2 argument constructor: 좌표의 점을 입력
		
		

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

	    //입력: 더할 포인트(CartesianPoint)

	    //출력: 더한 포인트(CartesianPoint)

	    //method2: toString()

	    //입력: 없음

	    //출력: 없음

	    //부수표과: 현 포인트객체의 좌표를 "x=???, y=???"로 화면에 출력

	
	
}
