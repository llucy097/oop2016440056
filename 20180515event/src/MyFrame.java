import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {//�� ��° ������� ActionListener�� implements�Ѵ�.
	//�ʵ� : ��� �޼ҵ忡�� ������ �� �ִ�.
	JButton button, btn; //��� �޼ҵ忡�� ������ �� �ִ�.
	JTextField tf;
	MyFrame(){		
		
		
			
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois event");
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout()); //�÷ο� ��ġ �Ŵ��� ���; ��ü�� ����� ��ü�� ����־�� ��

		button = new JButton("ù��° ��ư"); //��ư ��ü ����
		this.add(button);//��ư��ü�� �����ӿ� �߰�
//		MyListener listener = new MyListener();
//		this.button.addActionListener(this); //�̺�Ʈ ������ ��ü ���
		this.button.setActionCommand("button1");
		button.addActionListener(this);
		
		this.btn = new JButton("�ι�° ��ư"); //this : �ʵ�
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);
		
		tf = new JTextField(20);
		this.add(tf);
		
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//�׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư��ü�� ���۷�����) �����´�. 
//		JButton button = (JButton) e.getSource(); //JButton�� ��ü��� ���� �˷���
		
		if ((e.getActionCommand()).equals("button1"))
			this.tf.setText("ù��° ��ư");
		else
			this.tf.setText("�ι�° ��ư");
		
		

	}
}