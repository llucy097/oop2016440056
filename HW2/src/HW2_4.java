
public class HW2_4 {

	public static void main(String[] args) {
		// 3. 1���� 100������ ����(����) �߿��� 3�� ��������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ��, for���� ����Ͽ�
		
		int i, sum;
		sum = 0;
		
		for (i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				sum = sum + i;
			}
			else
				sum = sum;
				
		}
		System.out.println("3�� ������� ����: " + sum);
		
	}

}
