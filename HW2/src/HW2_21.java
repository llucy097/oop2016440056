import java.util.Scanner;

public class HW2_21 {

	public static void main(String[] args) {
		// 21. ����ڷκ��� �� ���ڸ� �Է¹޾�, 
		// �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		
		
		int a, num, sum, count, i;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		num = 2;
		sum = 0;
		
		while ( num <= a) {
			count = 0;
			
			
			for (i = 2; i < num; i++) {
				if(num%i == 0) {
					count++;
				}
				if(count==0) {
					sum = sum + num;
					break;
				}
			}
			num++;	
			
			}
		System.out.println(a+"������ �Ҽ����� ��: " +sum );
		
		
		
	}

}
