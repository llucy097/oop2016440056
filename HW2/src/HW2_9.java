import java.util.Scanner;

public class HW2_9 {

	public static void main(String[] args) {
		// ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, 
		// �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� 
		// �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		
		
		int a, i;
		i = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1���� 9������ ���� �ϳ��� �Է��Ͻÿ�.");
		
		
		
		while (true) {
			a = input.nextInt();
			if (a < 10 && a> 0) {
				System.out.println(a+"��");
				for (i=1; i<10; i++) {
					System.out.println(a + " X " + i + " = " + a*i);
				}
				break;
			}
			else {
				System.out.println("�����Դϴ�. 1���� 9������ ���ڸ� �ٽ� �Է��� �ּ���.");
				continue;
			}
				
			
		}
		
		
	}

}
