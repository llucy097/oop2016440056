import java.util.Scanner;

public class HW2_7 {

	public static void main(String[] args) {
		// 7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, 
		// �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		
		int i, a, sum;
		i = 1;
		sum = 0;
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("������ �Է��Ͻÿ�.");
		
		
		while (true) {
			a = input.nextInt();
			sum = sum + a;
			if (a == 0)
				break;
		}
		System.out.println("�Է��� ������ ��: " + sum);
		

	}

}
