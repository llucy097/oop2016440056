import java.util.Scanner;

public class HW2_19 {

	public static void main(String[] args) {
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, 
		// �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�Ҽ� �Ǻ��ϱ�");
		
		int a; 
		System.out.print("���ڸ� �Է�: ");
		a = input.nextInt();
		int i = 2;
		
		
		while (i <= a) {
			if (a==2) {
				System.out.println(a+"�� �Ҽ��Դϴ�.");
				break;
			}
			else {
				if (a%i != 0) {
					if (i == a-1) {
						System.out.println(a+"�� �Ҽ��Դϴ�.");
						break;
					
					}
					else {
						i++;
						continue;
					}
				}
			
			else
				System.out.println(a+"�� �Ҽ��� �ƴմϴ�.");
				break;
			}
		

	}

}
}
