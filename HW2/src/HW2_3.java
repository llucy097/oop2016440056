
public class HW2_3 {

	public static void main(String[] args) {
		// 3. 1���� 100������ ����(����) �߿��� 3�� ��������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ��, while���� ����Ͽ�
		
		int i, sum;
		i = 1;
		sum = 0;
		
		while (i <= 100) {
			if (i%3 == 0) {
				sum = sum + i;
				i++;
			}
			else
				i++;			
		}
		System.out.println("3�� ������� ����: " + sum);
		
	}

}
