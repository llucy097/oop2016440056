import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// �� ������ ex)ActionEvent�� 

//ù ��° �̺�Ʈ ������ ���� ���
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//�׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư��ü�� ���۷�����) �����´�. 
		JButton button = (JButton) e.getSource(); //JButton�� ��ü��� ���� �˷���
		button.setText("��ư�� ���������!!!");
//		System.out.println("OMG ��ư�� ���������!!!!!");

	}
	//���� �����ÿ��� ���� class�� �� ������ ���� �ϳ��� class�ȿ��� �����!

}
