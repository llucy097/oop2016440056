import java.util.Scanner;

public class HW2_10 {

	public static void main(String[] args) {
		// 10. �Ҽ�(prime-number) �˻�� ����ϰ� ����ڰ� �Է��� ���� 
		// �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int i, a;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		a = input.nextInt();
		System.out.print(a+"�� �μ�: ");
		for (i=1; i<=a; i++) {
			if (a%i == 0) {
				System.out.print(i + " ");
				continue;
			}
			else
				continue;
		}


	}

}
