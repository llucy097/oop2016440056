import java.util.Scanner;

public class HW2_6 {

	public static void main(String[] args) {
		// � ���� ����(n)�� �Է� �޾�(���� 0�̳� ���� ������ �Է��ϸ�, 
		// ���� �޽����� ��� ��, �ٽ� �Է��ϵ��� ó��), 
		// �� ���� 2n�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a;
		Scanner input = new Scanner (System.in);
		
		System.out.println("n�� �Է��Ͻÿ�: ");
		a = input.nextInt();
		
		while (a==0 || a<0) {
			System.out.println("�����Դϴ�. ���� ������ �Է��Ͻÿ�.");
			a = input.nextInt();
		}
		
		a = 2*a;
		System.out.println("2n�� : " + a);
		
		

	}

}
