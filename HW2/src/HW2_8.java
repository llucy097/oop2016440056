import java.util.Scanner;

public class HW2_8 {

	public static void main(String[] args) {
		// 1���� 9������ ���� �ϳ��� �Է� �޾� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(5�̸� 5���� ���)
		
		int a, i;
		i = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1���� 9������ ���� �ϳ��� �Է��Ͻÿ�.");
		a = input.nextInt();
		System.out.println(a+"��");
		
		for (i=1; i<10; i++) {
			System.out.println(a + " X " + i + " = " + a*i);
		}

	}

}
