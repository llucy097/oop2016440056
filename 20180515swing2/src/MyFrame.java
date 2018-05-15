import java.awt.FlowLayout;

import javax.swing.*;//swing에 있는 것들을 모두 상속받고 싶다.
//프레임 만드는 방법 2 : JFrame으로부터 상속받은 클라스를 만든다. 
public class MyFrame extends JFrame {
	MyFrame(){
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("choice 2nd frame");
		
		//새로운 컴포넌트를 프레임에 추가
		setLayout(new FlowLayout()); //플로우 배치 매니저 사용; 객체를 만들어 객체를 집어넣어야 함
		// FlowLayout f1 = new FlowLayout();  f1 : 참조변수
		// this.setLayout(f1);
		
		JLabel label = new JLabel("네자리 정수를 입력하세요: "); //레이블 객체 생성
		JTextField tf = new JTextField(20); // 텍스트필드 객체 생성
		JButton button = new JButton("choice button"); //버튼 객체 생성
		
		button.setText("변세림");
		tf.setText("봄은봄이로데졸립다");
		
		//패널 생성
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		this.add(button); // 버튼 객체를 프레임에 추가
		this.add(panel);
//		this.add(label); //레이블 객체를 프레임에 추가
//		this.add(tf); //텍스트필드 객체를 프레임에 추가
		//add하는 순서에 따라서 버튼의 위치가 달라진다. 조심할 것!

//		pack(); //프레임 사이즈를 컴포넌트의 크기에 맞춰 조절시킴
		
		
		this.setVisible(true);
		
	}

}
