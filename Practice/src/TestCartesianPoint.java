
public class TestCartesianPoint {

	public static void main(String[] args) {
		
		CartesianPoint pnt = new CartesianPoint(3.0, 4.0);
		pnt.setX(5.0);
		pnt.setY(1.4);
		
		pnt.addPoint();
		
		System.out.println(pnt.toString());
	}

}
