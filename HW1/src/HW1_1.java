import java.util.Scanner;

public class HW1_1 {

	public static void main(String[] args) {
		// 1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.println("1�� ����");
		
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.println("�� ��° ������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		
		if (a > b) 
			System.out.println("ū ���� " + a + "�Դϴ�.");
		else
			System.out.println("ū ���� " + b + "�Դϴ�.");
		
		System.out.println("=======�ý�������=======");

		
		

	}

}
