import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {//두 번째 구현방법 ActionListener를 implements한다.
	//필드 : 모든 메소드에서 접근할 수 있다.
	JButton button, btn; //모든 메소드에서 접근할 수 있다.
	JTextField tf;
	MyFrame(){		
		
		
			
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois event");
		
		//새로운 컴포넌트를 프레임에 추가
		setLayout(new FlowLayout()); //플로우 배치 매니저 사용; 객체를 만들어 객체를 집어넣어야 함

		button = new JButton("첫번째 버튼"); //버튼 객체 생성
		this.add(button);//버튼객체를 프레임에 추가
//		MyListener listener = new MyListener();
//		this.button.addActionListener(this); //이벤트 리스너 객체 등록
		this.button.setActionCommand("button1");
		button.addActionListener(this);
		
		this.btn = new JButton("두번째 버튼"); //this : 필드
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);
		
		tf = new JTextField(20);
		this.add(tf);
		
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 레퍼런스값) 가져온다. 
//		JButton button = (JButton) e.getSource(); //JButton의 객체라는 것을 알려줌
		
		if ((e.getActionCommand()).equals("button1"))
			this.tf.setText("첫번째 버튼");
		else
			this.tf.setText("두번째 버튼");
		
		

	}
}