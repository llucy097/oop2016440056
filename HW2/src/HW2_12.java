import java.util.Scanner;

public class HW2_12 {

	public static void main(String[] args) {
		// 12. for��(while)�� ���� �ݺ��� break ���� �̿��Ͽ�
		// 0�� �Էµ� ������ �Է� ���� ���� �� ���� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a, num, max;
		max = 0;
		System.out.println("������ �Է��Ͻÿ�.");
		
		Scanner input = new Scanner (System.in);
		while (true) {
			a = input.nextInt();
			
			num = a;
			if (num > max) 
				max = num;
			
			if (a != 0) {
				continue;
			}
			else
				System.out.println("���� ū ����: "+max);
				break;
		}
		
	}

}
