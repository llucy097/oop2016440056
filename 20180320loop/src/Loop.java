
public class Loop {

	public static void main(String[] args) {
		//1~10 ������ ȭ�鿡 ���
		int i;// i�� ��������
		i = 1;// 1. �������� �ʱ�ȭ 
		while (i<=10) { // 2. ���� ���ǽ�
			System.out.println(i);// 3. ������
			i++;// 4. �������� ��ȭ
		}
		System.out.println("=================���α׷� ����=================");

		//1~10 ������ ��
		int a, sum;
		a = 1;
		sum = 0;
		while (a<=10) {
			sum = sum + a;
			a++;
		}
		System.out.println("Sum = " + sum);
		System.out.println("=================���α׷� ����=================");
		
		//for������ 1~10 ������ ȭ�鿡 ���
		for (i = 1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("=================���α׷� ����=================");
		
		//for������ 1~10 ������ ��
		for (a = 1, sum = 0; a<=10; sum = sum + a, a++) {
				
		}
		System.out.println("Sum = " + sum);
		System.out.println("=================���α׷� ����=================");
		
		//���忡�� l�� ���� ���ϱ�
		String str = "hello darkness my old friend";
		int count = 0;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("���忡�� �߰��� l�� ���� : " + count);
		System.out.println("=================���α׷� ����=================");
		
		
		
		
		
		
	}

}
