import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// 맨 마지막 ex)ActionEvent만 

//첫 번째 이벤트 리스너 구현 방법
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 레퍼런스값) 가져온다. 
		JButton button = (JButton) e.getSource(); //JButton의 객체라는 것을 알려줌
		button.setText("버튼이 눌러졌어요!!!");
//		System.out.println("OMG 버튼이 눌러졌어요!!!!!");

	}
	//계산기 구현시에도 따로 class를 더 만들지 말고 하나의 class안에서 만들기!

}
