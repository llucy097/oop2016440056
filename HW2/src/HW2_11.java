import java.util.Scanner;

public class HW2_11 {

	public static void main(String[] args) {
		// 11. 10���� ������ 0�� �Է��ϱ� �������� ��� �����ϵ��� ����.
		
		int i, a;
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("");
			System.out.println("������ �Է��Ͻÿ�.");
			
			a = input.nextInt();
			if (a == 0)
				break;
			else {
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

}
}