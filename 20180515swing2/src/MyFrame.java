import java.awt.FlowLayout;

import javax.swing.*;//swing�� �ִ� �͵��� ��� ��ӹް� �ʹ�.
//������ ����� ��� 2 : JFrame���κ��� ��ӹ��� Ŭ�󽺸� �����. 
public class MyFrame extends JFrame {
	MyFrame(){
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("choice 2nd frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout()); //�÷ο� ��ġ �Ŵ��� ���; ��ü�� ����� ��ü�� ����־�� ��
		// FlowLayout f1 = new FlowLayout();  f1 : ��������
		// this.setLayout(f1);
		
		JLabel label = new JLabel("���ڸ� ������ �Է��ϼ���: "); //���̺� ��ü ����
		JTextField tf = new JTextField(20); // �ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("choice button"); //��ư ��ü ����
		
		button.setText("������");
		tf.setText("�������̷ε�������");
		
		//�г� ����
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		this.add(button); // ��ư ��ü�� �����ӿ� �߰�
		this.add(panel);
//		this.add(label); //���̺� ��ü�� �����ӿ� �߰�
//		this.add(tf); //�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
		//add�ϴ� ������ ���� ��ư�� ��ġ�� �޶�����. ������ ��!

//		pack(); //������ ����� ������Ʈ�� ũ�⿡ ���� ������Ŵ
		
		
		this.setVisible(true);
		
	}

}
