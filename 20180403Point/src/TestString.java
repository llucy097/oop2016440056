
public class TestString {

	public static void main(String[] args) {
		
		String str1 = new String ("Hello");
		String str2 = new String ("Hello");
		
		System.out.println(str1==str2);//��ü�� ����(�ּ�, reference ��)�� �ٸ��� ������ false ���ͷ��� ��ȯ
		System.out.println(str1.equals(str2));//�� ��ü�� ������ ������ �˻�
		
		str1 = str2; // reference���� ���ٴ� ��, ���� ��ü�� �����ϰ� �ִٴ� ��
		System.out.println(str1 == str2);
		
		
		
		
		
	}

}
