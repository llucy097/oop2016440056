import java.util.Scanner;

public class HW1_3 {

	public static void main(String[] args) {
		// 3. �� ��(������)�� �Է¹޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.println("3�� ����");

		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.println("�� ��° ������ �Է��Ͻÿ� : ");
		b = input.nextInt();
		System.out.println("�� ��° ������ �Է��Ͻÿ� : ");
		c = input.nextInt();
		
		if (a>b && a>c)
			System.out.println("���� ū ���� " + a + "�̴�.");
		else if (b>a && b>c)
			System.out.println("���� ū ���� " + b + "�̴�.");
		else
			System.out.println("���� ū ���� " + c + "�̴�.");
		
		System.out.println("=======�ý�������=======");
		
	}

}
