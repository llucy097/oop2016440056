import java.util.Scanner;

public class HW2_2 {

	public static void main(String[] args) {
		// 2. 10���� ������ �Է� �޾� �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int i, a;
		int sum;
		Scanner input = new Scanner (System.in);
		
		i = 1;
		sum = 0;
		
		System.out.println("������ �Է��ϼ���.");
		while (i <= 10) {
			System.out.println(i + "�� ° ���� : ");
			a = input.nextInt();
			sum = sum + a;
			i++;
		}
		System.out.println("10���� ������ ���� : " + sum);

	}

}
