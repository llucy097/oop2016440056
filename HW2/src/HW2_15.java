import java.util.Scanner;
import java.util.Random;

public class HW2_15 {

	public static void main(String[] args) {
		// 15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 
		// 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.
		// (10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ�
		// Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("10�� �̳��� 1-100���� ������ ���ڸ� ���߽ÿ�.");
		int i, a;
		int rand = randomRange(1, 100);
		
		
		for (i = 1; i <= 10; i++ ) {
			System.out.println(i + "��° �Է�: " );
			a = input.nextInt();
			if (rand == a) {
				System.out.println("�����Դϴ�");
				break;
			}
			else if (rand > a) {
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
				continue;
			}
			else 
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
				continue;
		}
		if (i > 10)
			System.out.println("GAVE OVER");
		
	

	}
	
	
	int b = 1;
	int c = 100;
	private static int randomRange(int b, int c) {
		
		return (int) (Math.random()*(c-b+1)+b);
	}

}
