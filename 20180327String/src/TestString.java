
public class TestString {

	public static void main(String[] args) {
		// ��ü�����̶�? ���� ���踦 �𵨸��Ͽ� ����Ʈ��� �����ϴ� ���
		// procedure programming : ������ �ذ��ϴ� ���� �߿�
		// object oriented programming
		
		// ��� ��ü�� ����(state : ��ü�� Ư¡��/�Ӽ�) �� ����(behavior : ��ü�� ���� �� �ִ� ����)�� ������ �ִ�.
		
		// String Ŭ������ �޼ҵ�
		
		int a = 10; // int���� ���� a ���� + �� 10�� a�� ����
		// string ��ü ���� ��� (String : Ŭ���� �̸�)
		String str; // Ŭ�� ��Ʈ���� ��ü�� ������ �� �ִ� ���� ����(���۷��� ����) ����
		str = new String("Hello darkness my old friend.");// ��ü ����
		// a, str : ���� 
		// java ���� ũ�� 2���� (1. ���ú���(primitive variable) : c�κ��� / 2. ��������(reference variable) : ��ü����
		
		
		//String ��ü�� ����
		//�޼ҵ� ȣ�� ���: ��������.�޼ҵ�()
		//System.out.println("string length is "+str.length());
		int len = str.length();
		
		System.out.println(str);
		
		System.out.println("string length is "+len);
		
		String str1;
		str1 = str.toLowerCase();
		System.out.println(str1);
		
		System.out.println(str.toUpperCase());
		
		
		// 2. 
		
	}

}
