import java.util.Scanner;

public class HW2_13 {

	public static void main(String[] args) {
		// 13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� 
		// �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) 
		// 1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		
		System.out.println("mondth�� day�� �Է��ϼ���.");
		int m, d, total;
		Scanner input = new Scanner(System.in);
		total = 0;
		System.out.println("month: ");
		m = input.nextInt();
		System.out.println("day: ");
		d = input.nextInt();
		
		
		System.out.print("1�� 1�Ϻ��� "+m+"�� "+d+"�ϱ��� �� day��: ");
		
		switch (m) {
		case 1:
			total = 0;
			break;
		case 2:
			total = 31;
			break;
		case 3:
			total = 31+28;
			break;
		case 4:
			total = 31*2+28;
			break;
		case 5:
			total = 31*2+28+30;
			break;
		case 6:
			total = 31*3+28+30*1;
			break;
		case 7:
			total = 31*3+28+30*2;
			break;
		case 8:
			total = 31*4+28+30*2;
			break;
		case 9:
			total = 31*5+28+30*2;
			break;
		case 10:
			total = 31*5+28+30*3;
			break;
		case 11:
			total = 31*6+28+30*3;
			break;
		case 12:
			total = 31*6+28+30*4;
			break;
		
	}
		total = total+d;
		System.out.println(total);
		
		
		
	}

}
