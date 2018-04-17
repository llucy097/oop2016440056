
public class TestPoint {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		//xÁÂÇ¥, yÁÂÇ¥ ¼³Á¤
		double temp1 = 1.0;
		double temp2 = 2.0;
		
		p.setX(temp1);
		p.setY(temp2);
		
		
		//ÁÂÇ¥ Ãâ·Â
		System.out.println("("+p.getX()+", " + p.getY() + ")");
		

		//Á¡°ú Á¡ »çÀÌ Ãâ·Â
		System.out.println(p.distance());
		
	
		
		
		
	}

}
