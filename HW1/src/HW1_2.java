import java.util.Scanner;

public class HW1_2 {

	public static void main(String[] args) {
		// 2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.println("2�� ����");
		
		int a;
		Scanner input = new Scanner (System.in);
		System.out.println("������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		
		
		if (a%2 == 0)
			System.out.println(a + " ��/�� ¦���Դϴ�.");
		else 
			System.out.println(a + " ��/�� Ȧ���Դϴ�.");
		
		System.out.println("=======�ý�������=======");
		

	}

}
