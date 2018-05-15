import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("choice frame");
		frame.setSize(900,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//클라스명.static variable (static variable이 모두 대문자일 때 : final(constant)라는 뜻
		frame.setVisible(true);
		

	}

}
