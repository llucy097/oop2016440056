import java.util.Scanner;

public class HW1_6 {

	public static void main(String[] args) {
		// 6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		// ����� �Է� : �� ���� �� �ڸ� ����
		// ��� : �ڸ����� ������ �ݴ�� �� ����
		
		int a, b, c;
		
		System.out.print("�� ���� �� �ڸ� ����: ");
		
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		
		if (a >= 10 && a < 100) {
			b = a/10;
			c = a%10;
			System.out.println("�ڸ����� ������ �ݴ�� �� ����: "+c+b);
		}

	}

}
